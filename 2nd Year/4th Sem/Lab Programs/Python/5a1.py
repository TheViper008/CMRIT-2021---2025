def isPhoneNumber(text):
    if len(text) > 12:
        return False
    else:
        phno = text.split("-")
        for i in phno:
            if i.isdigit():
                continue
            else:
                return False
        
        if len(phno[0])==3 and len(phno[1])==3 and len(phno[2])==4:
            return True
        else:
            return False
        
print(isPhoneNumber(input("Enter Text:")))