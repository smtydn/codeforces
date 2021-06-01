row_idx = 0
column_idx = 0

for i in range(5):
    row = input().split()
    if "1" in row:
        row_idx = i
        column_idx = row.index("1")    

print(abs(2 - row_idx) + abs(2 - column_idx))
