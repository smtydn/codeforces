stone_count = int(input())
stones = input()

count = 0
for i in range(stone_count - 1):
    if stones[i] == stones[i + 1]:
        count += 1

print(count)