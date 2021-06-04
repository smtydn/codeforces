word = input()

uppercase_count = 0
lowercase_count = 0
for c in word:
    if ord(c) < 97:
        uppercase_count += 1
    else:
        lowercase_count += 1
        

if uppercase_count > lowercase_count:
    word = word.upper()
else:
    word = word.lower()

print(word)
