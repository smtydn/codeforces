n = int(input())
boys = sorted(map(int, input().split()))
m = int(input())
girls = sorted(map(int, input().split()))

p1 = 0
p2 = 0
res = 0

while (p1 < n and p2 < m):
	if (abs(boys[p1] - girls[p2]) <= 1):
		res += 1
		p2 += 1
		p1 += 1
	else:
		if boys[p1] < girls[p2]:
			p1 += 1
		else:
			p2 += 1

print(res)