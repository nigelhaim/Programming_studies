
from itertools import permutations


people = ["Jaime", "Kulas", "Lito ", "Mario"]
prices = [
    [7, 8 ,12, 2],
    [7, 4, 10, 8],
    [7, 5, 3, 9],
    [13, 9, 5, 6],
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
    total = a+b+c+d
    j = [j[0] + 1,j[1] + 1,j[2] + 1, j[3] + 1]
    if count > 9: 
        print(count, j, " ||  ", a, "+", b, "+", c, "+", d, " = ", total)
    else: 
        print(count, j, "  ||  ", a, "+", b, "+", c, "+", d, " = ", total)
