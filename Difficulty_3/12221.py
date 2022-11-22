num = int(input())
for i in range(1, num+1) :
  a, b = map(int, input().split())
  if a >= 10 or b>=10 :
    print('#{} {}'.format(i, -1))
  else :
    print('#{} {}'.format(i, a*b))
