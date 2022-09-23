from itertools import permutations


people = ["Ariana", "Bruno ", "Cardi "]
prices = [
    [2, 3 , 4],
    [5, 7, 8],
    [9, 6, 10],
]
print("CHART")
for i in range(len(people)):
    print(people[i], " || ", prices[i])
print("\n")
count = 0
l = list(permutations(range(0, 3)))
for j in list(l):
    count = count + 1
    a = prices[0][j[0]]
    b = prices[1][j[1]]
    c = prices[2][j[2]]
    total = a+b+c
    j = [j[0] + 1,j[1] + 1,j[2] + 1]
    if count > 9: 
        print(count, j, " ||  ", a, "+", b, "+", c," = ", total)
    else: 
        print(count, j, "  ||  ", a, "+", b, "+", c," = ", total)
