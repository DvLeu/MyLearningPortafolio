n = int(input())
while range(0 , n+1):
    phr = input()
    first_char = phr[0]
    cont = len(phr)
    second_char = phr[cont-1]
    if(cont > 10):
            print(first_char, end='')
            print((cont - 2), end='')
            print(second_char, end='')
    else:
            print(phr)