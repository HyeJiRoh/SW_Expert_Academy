num = int(input())

for test_case in range(1,num+1):
    arr = map(int, input().split())
    answer = 0
    for i in arr:
        if i%2!=0:
            answer += i
    print("#"+str(test_case),str(answer))
