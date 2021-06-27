n = int(input())
a = list(map(int, input().split()))

dp = [[0 for _ in range(n)] for _ in range(n)]
for i in range(n):
	dp[i][i] = sum(a) + (1 if a[i] == 0 else -1)

for i in range(n):
	for j in range(i + 1, n):
		dp[i][j] = dp[i][j - 1] + (1 if a[j] == 0 else -1)


print(max(map(max, dp)))