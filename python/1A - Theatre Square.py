n, m, a = map(int, input().split())

row = n // a
if (n % a != 0):
    row += 1

column = m // a
if (m % a != 0):
    column += 1

print(row * column)
