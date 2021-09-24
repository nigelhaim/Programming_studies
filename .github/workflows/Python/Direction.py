brng = 0 
tr_brng = 0
tr_brng = int(input("Bearing: "))

if tr_brng > 0 and tr_brng < 360:
	brng = 180 - tr_brng
	if tr_brng  > 0 and tr_brng  < 90:
		print("N", brng, "E")

	if  tr_brng  > 90 and tr_brng  < 180:
		print("N", brng, "E")

	if tr_brng  > 180 and tr_brng < 270:
		print("N", brng, "E")

	if tr_brng > 270 and tr_brng < 360:
		print("N", brng, "E")

