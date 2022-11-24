from itertools import permutations


people = ["Ana ", "belen ", "Caloy ", "Dnate "]
prices = [
    [5, 2 , 7, 3],
    [4, 6, 5, 7],
    [2, 5, 8, 4],
    [6, 4, 6, 8]
]
print("CHART")
for i in range(len(people)):
    print(people[i], " || ", prices[i])
print("\n")
count = 0
l = list(permutations(range(0, 4)))
for j in list(l):
    count = count + 1
    a = prices[0][j[0]]
    b = prices[1][j[1]]
    c = prices[2][j[2]]
    d = prices[3][j[3]]
    total = a+b+c
    j = [j[0] + 1,j[1] + 1,j[2] + 1,j[3] + 1]
    if count > 9: 
        print(count, j, " ||  ", a, "+", b, "+", c, "+", d, " = " , total)
    else: 
        print(count, j, " ||  ", a, "+", b, "+", c, "+", d, " = " , total)
