n, m, a, b = map(int, input().split())

# if buying a special ticket does not have any advantage
# over buying a single ticket, than just calculate over
# buying a single ticket
if m * a <= b:
	print(n * a)
# else, buy special ticket for its max usage, then
# calculate for the next part if it is worth or not
else:
	result = 0
	while n:
		if n > m:
			result += b
			n -= m
		else:
			if n * a <= b:
				result += n * a
			else:
				result += b
			n = 0
	print(result)
