n, k = [int(x) for x in input().split()]
scores = [int(x) for x in input().split()]

treshold = scores[k - 1]

advance_count = 0
for score in scores:
    if score > 0 and score >= treshold:
        advance_count += 1
    else:
        break
print(advance_count)
