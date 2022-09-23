instanceArray = [-5,1,2,-2,6,8,-4,3]

LargestSum = 0
count = 1
String = ""
for i in instanceArray:
    String = str(i)
    LargestSum = i
    for j in range(len(instanceArray)-count):
        LargestSum = LargestSum + int(instanceArray[j+(count)])
        String = String + " + " + str(instanceArray[j+(count)])
        print(String, " = " , LargestSum)
    count = count+1
    print("\n")