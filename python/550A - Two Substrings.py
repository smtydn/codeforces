text = input()

ab = []
ba = []

for i in range(len(text) - 1):
	if text[i:i+2] == "AB":
		ab.append(i)
	elif text[i:i+2] == "BA":
		ba.append(i)

if len(ab) == 0 or len(ba) == 0:
	print("NO")
elif (abs(max(ab) - min(ba)) >= 2) or (abs(min(ab) - max(ba)) >= 2):
	print("YES")
else:
	print("NO")