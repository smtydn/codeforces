number = input()

lucky_digit_count = 0

for n in number:
    if n in ["4", "7"]:
        lucky_digit_count += 1

if lucky_digit_count in [4, 7]:
    print("YES")
else:
    print("NO")
