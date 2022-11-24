class pacman:
    def printer(self, arr): 
            loc = 0 
            for i in range (len(arr)):
                for j in arr[i]:
                    print(" ", j, end = " |")
                    """
                    else:
                        print(" ")
                        print(arr[i])
                        print("")
                    """
                print()
                print("----|----|----|----|----|")

print("========================")
print("WELCOME TO PACMAN")
print("========================")
print("By: Nigel Sebastian")
print()


arr=[
    ['s', '0', '0', '0', '0'],
    ['0', '0', '0', '0', '0'],
    ['0', '0', '0', '0', '0'],
    ['0', '0', '0', '0', '0'],
    ['0', '0', '0', '0', 'f'],

    ]

t = pacman()

print(t.printer(arr))

#The formula for the possible moves is (m+n)-2