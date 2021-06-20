word = input()
hello_array = list("hello")

idx = 0
for c in word:
	if c == hello_array[idx]:
		idx += 1
	if idx == len(hello_array):
		break

if idx == len(hello_array):
	print("YES")
else:
	print("NO")