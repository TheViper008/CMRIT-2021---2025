import difflib

def String_Similarity(str1,str2):
    result = difflib.SequenceMatcher(a=str1.lower(),b = str2.lower())
    return result.ratio()

str1= input("Enter String 1:")
str2= input("Enter String 2:")
print(String_Similarity(str1,str2))