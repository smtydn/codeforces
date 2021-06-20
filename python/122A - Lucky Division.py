number = int(input())

lucky_numbers = [
	4, 7,
	44, 47, 74, 77,
	444, 447, 474, 477, 744, 747, 774, 777
]

flag = False
for ln in lucky_numbers:
	if ln > number:
		break
	if number == ln:
		flag = True
		break
	if number % ln == 0:
		flag = True
		break

if flag:
	print("YES")
else:
	print("NO")