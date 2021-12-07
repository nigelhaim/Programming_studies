import math
p = 1
n = 0 
x = 1
y = 0
while x != 0:
	x = int(input("X = "))
	if x != 0:
		p = p * x

		y = float(y + (1/x))
			
		n = n + 1
		
	geo_mean = p**(1/n)


	har_mean = n / y


	print ("Geometric mean = ", geo_mean)
	print ("Harmonic mean = ", har_mean)