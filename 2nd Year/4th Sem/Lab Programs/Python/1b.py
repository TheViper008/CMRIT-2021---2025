n = input("Enter a number-")
rev = n[::-1]
if rev == n:
    print("Palindrome")
else:
    print("Not Palindrome")

freq = {}
num = int(n)
while num!=0:
    digit = num%10
    if digit in freq:
        freq[digit] += 1
    else:
        freq[digit]=1
    num = num//10
print(freq)