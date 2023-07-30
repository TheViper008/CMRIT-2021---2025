import re
def isphno(text):
    if re.search(r"\d\d\d-\d\d\d-\d\d\d\d",text):
        print(True)
    else:
        print(False)

isphno(input("Enter text:"))