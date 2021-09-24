A = 500
w = int(input("Weight in kg: "))
t = input("Package type A or B: ")
d = int(input("Distance in Km: "))


if t == "A" or t == "a":
	if w <= 5 and w > 0:
		gross = w * (10.50 * (d/A))
		net = gross + (gross * 0.10)

	if w > 5 and w < 10:
		gross = w * (15.75 * (d/A))
		net = gross + (gross * 0.10)

	if w > 10 and w < 20:
		gross = w * (20.65 * (d/A))
		net = gross + (gross * 0.10)

if t == "B" or t == "b":
	if w <= 5 and w > 0:
		gross = w * (11.75 * (d/A))
		net = gross + (gross * 0.10)

	if w > 5 and w < 10:
		gross = w * (18.50 * (d/A))
		net = gross + (gross * 0.10)

	if w > 10 and w < 20:
		gross = w * (23.65 * (d/A))
		net = gross + (gross * 0.10)

print("Charge: ", gross)
print("Total Charge: ",net)