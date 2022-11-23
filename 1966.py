T = int(input())

for i in range(1, T+1) :
  n = int(input())
  arr = list(map(int, input().split()))
  arr.sort()

  print('#{}'.format(i), end = " ")
  
  for a in arr :
    print(a, end=" ")
  print('')
