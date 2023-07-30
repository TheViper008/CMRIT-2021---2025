def bintodec(n):
    d = 0
    p = 0 
    while(n!=0):
        rem = n %10
        d = d + (rem*2)**p
        p = p+ 1
        n = n//10
    return d
print(bintodec(int(input("Enter a binary number-"))))

def octtohex(n):
    s = 0
    c = 0
    while n!=0:
        s = s + (n%10)*8**c
        n = n//10
        c = c+1
    print(hex(s))
octtohex(int(input("Enter Octal Value-")))