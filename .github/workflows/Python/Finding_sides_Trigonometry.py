from math import sqrt
ans = 0
print("This is a calculator to find the sides of a right triangle if 1 value is not available please put 0")
a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))

if a == 0.000: 
    s = float((b * b) - (c * c))
    ans = sqrt(float(s))
elif b == 0.000:
    s = float((a * a) - (c * c))
    ans = sqrt(float(s))
elif c == 0.000:
    s = float((a * a) + (b * b))
    ans = sqrt(float(s))

print("The missing side is", ans)