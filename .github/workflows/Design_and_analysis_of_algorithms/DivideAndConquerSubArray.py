
from turtle import right


def divideAndConquer(insArray, n):
    if n==1:
        return insArray[0]
    m = int(n/2)
    lss = divideAndConquer(insArray, m)
    r = insArray[len(insArray)//2:]
    rss = divideAndConquer(r, n-m)
    leftsum = 0
    rightsum = 0
    summ = 0
    i = m
    j = m-1
    while i < n:
        summ = summ + insArray[i]
        rightsum = max(rightsum, summ)
        i = i+1
    summ = 0 
    while j >= 0:
        summ += insArray[j]
        leftsum = max(leftsum, summ)
        j = j-1
    
    ans = max(lss, rss)
    return max(ans, leftsum+rightsum)
instanceArray = [-5,1,2,-2,6,8,-4,3]

print("The largest sum is " , divideAndConquer(instanceArray, len(instanceArray)))
