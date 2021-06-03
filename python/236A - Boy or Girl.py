from collections import Counter


counter = Counter(input())

if (len(counter) % 2 == 0):
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")
