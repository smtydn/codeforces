n, l = map(int, input().split())
locs = sorted(list(map(int, input().split())))

max_diff = max(locs[0], l - locs[-1])
for i in range(1, n):
	max_diff = max(max_diff, (locs[i] - locs[i - 1]) / 2)

print(max_diff)
