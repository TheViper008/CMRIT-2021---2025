sent = input("Enter a sentence:")
numwords = sent.split()
print("The number of words in the sentence is :",len(numwords))
d = 0
u = 0
l = 0
for char in sent:
    if char.isdigit():
        d += 1
    elif char.isupper():
        u += 1
    elif char.islower():
        l += 1
    
print(f"The number of digits in the sentence is:{d}")
print(f"The number of Uppercase characters in the sentence is:{u}")
print(f"The number of Lowercase characters in the sentence is:{l}")