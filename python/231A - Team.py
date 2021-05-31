problem_count = int(input())

submission_count = 0
for _ in range(problem_count):
    decision_total = sum([int(x) for x in input().split()])
    if decision_total > 1:
        submission_count += 1
print(submission_count)
