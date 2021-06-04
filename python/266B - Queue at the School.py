queue_size, step = map(int, input().split())
queue = list(input())

for _ in range(step):
    i = 0
    while i < queue_size - 1:
        if queue[i] == "B" and queue[i + 1] == "G":
            queue[i], queue[i + 1] = queue[i + 1], queue[i]
            i += 1
        i += 1
print("".join(queue))