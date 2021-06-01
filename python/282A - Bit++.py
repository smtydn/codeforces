operation_count = int(input())

output = 0
for _ in range(operation_count):
    operation = input()

    if '+' in operation:
        output += 1
    else:
        output -= 1

print(output)
