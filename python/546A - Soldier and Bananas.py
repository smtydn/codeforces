banana_cost, dollars, banana_count = map(int, input().split())


for i in range(1, banana_count + 1):
    dollars -= banana_cost * i

if (dollars < 0):
    print(-dollars)
else:
    print(0)
