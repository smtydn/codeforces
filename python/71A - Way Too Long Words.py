input_count = int(input())

outputs = []
for _ in range(input_count):
    string = input()
    if len(string) > 10:
        outputs.append(string[0] + str(len(string) - 2) + string[-1])
    else:
        outputs.append(string)
for output in outputs:
    print(output)
