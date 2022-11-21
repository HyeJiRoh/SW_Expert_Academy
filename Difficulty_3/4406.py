num = int(input())

for k in range(1, num + 1) :
    data = input()
    result = ''
    for i in range(len(data)) :
        if data[i] in ['a', 'e', 'i', 'o', 'u'] :
            continue
        result += data[i]

    print('#%d %s' % (k, result))
