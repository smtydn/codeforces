word = input()

if ord(word[0]) >= 97:
    word = chr(ord(word[0]) - 32) + word[1:]

print(word)
