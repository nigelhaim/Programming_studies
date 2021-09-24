# Starting value of blocks
numofblocks = 0
# Check if number of blocks is 1 to 8
while 1 > numofblocks or 8 < numofblocks:
    try:
        # Get User the number of blocks
        numofblocks = int(input("Number of Blocks:"))
    except ValueError:
        print("Only 1 to 8 Please")
# Get how many blocks
if numofblocks <= 8 or numofblocks >= 1:
    x = 0
    y = numofblocks
    n = 0
    for t in range(numofblocks):
        # Left Side
        while x < numofblocks:
            y -= 1
            for h in range(y):
                print(" ", end="")
            n += 1
            for b in range(n):
                print("#", end="")
            # Space for both sides
            print("  ", end="")
            # Right Side
            x += 1
            for a in range(x):
                print("#", end="")
            print()
