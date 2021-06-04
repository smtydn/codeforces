stop_count = int(input())

max_capacity = 0

capacity = 0
for _ in range(stop_count):
    a, b = map(int, input().split())
    capacity -= a
    capacity += b
    max_capacity = max(max_capacity, capacity)

print(max_capacity)