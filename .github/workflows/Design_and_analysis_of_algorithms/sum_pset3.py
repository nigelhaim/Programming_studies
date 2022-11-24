import os
import numpy as np
def binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    mid = 0
 
    while low <= high:
 
        mid = (high + low) // 2
 
        # If x is greater, ignore left half
        if arr[mid] < x:
            low = mid + 1
 
        # If x is smaller, ignore right half
        elif arr[mid] > x:
            high = mid - 1
 
        # means x is present at mid
        else:
            return mid
    # If we reach here, then the element was not present
    return -1

def tester(num_Array):
    arr_len = len(num_Array)
    it = 0 
    for i in num_Array:
        for j in range(arr_len - it):
            if num_Array[j+it] != i:
                ans = i+num_Array[j+it]
                print(i , " + " , num_Array[j+it] , " = " , ans)
        it = it + 1




print("These are all possible sums of the array")
#THIS IS WHERE YOU MODIFY THE ARRAY
arr_num = np.array([5,-9,1,3])

print("\n")
print("=======Tester===============")
print("\n")

print(arr_num)
tester(arr_num)
print("\n")
print("=======Main Program===============")
print("\n")

"""
#MAIN PROGRAM
#Big-O is O(n)
##############################################
sum = int(input("Please input the desired sum: "))#Gets the desired sum
print("Result: ")#UI (DO NOT INCLUDE)
arr_num.sort()#Sorts the array 
print(arr_num)#Prints the sorted array (DO NOT INCLUDE)
minuend = 0#Initiates a variable
for i in arr_num:#For loop to find the largest number that is less than the desired sum 
    if i <= sum:
         minuend = i#Sets the number as a subtrahend 
subtrahend = sum - minuend#Subtracts the largest number that is less than the desired sum  


print("No")#Else no
"""
#NOTE:All printing is for UI purposes only
##############################################

#MAIN PROGRAM V2 
#Big-O is O(n lg n)
##############################################
sum = int(input("Please input the desired sum: "))#Gets the desired sum
print("Result: ")#UI (DO NOT INCLUDE)
arr_num.sort()#Sorts the array 
result = 0
p = 0
for i in arr_num:#For loop to find the largest number that is less than the desired sum 
    if i <= sum:
        print(sum-i, "  || ", arr_num[p:len(arr_num)])
        result = binary_search(arr_num[p:len(arr_num)], sum - i)
        if result != -1:
            print("Yes")
            os._exit(0)
    p = p + 1
print("No")








"""

#presortMode(A[0...n-1], sum)
sort the array A
minuend <- 0 
while i <= n-1 do 
	if A[i] <= sum
		minuend <- A[i]
subtrahend <- sum - minuend
while j <= n-1 do 
	if A[j] = subtrahend
		return Yes

return no

==============================
presortMode(A[0...n-1], sum)
sort the array A
counter <- 0
minuend <- 0 
while i <= n-1 do 
	if A[i] <= sum 
		counter <- 0 
		minuend <- A[i]
subtrahend <- sum - minuend
while j <= n-1 - counter
	if A[j] = subtrahend 
		return Yes 
return No

=============================

presortMode(A[0...n-1], sum)
sort the array A //O(n lg n)
minuend <- 0 
for i <= n-1 do //finds the largest number that is less than the sum in the array O(n)
    if A[i] <= sum 
        minuend <- A[i]
subtrahend <- sum - minuend 
Search subtrahend in the array using binary search //Binary search cannot run without sorted array O(log n) 
if found:
    return yes 
else
    return no

"""