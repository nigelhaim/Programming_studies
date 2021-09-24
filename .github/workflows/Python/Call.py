minu = 0 
cost = 0
price = 0

minu = int(input("Duration in minutes: "))

time = input("Day - A or Night - B? /n  Answer: ")

cost = (minu * 4)

if time == "Night" or "night" or "b" or "B":
	price = cost * 0.5

if minu > 60:
	price = price * 0.15

final_net = price + (price * 0.12)

print("Gross cost: P",price)
print("Net cost: P",final_net)
