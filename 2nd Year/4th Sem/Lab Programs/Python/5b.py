import re
ph=r"\+\d\d\d\d\d\d\d\d\d\d\d\d"
email = r"[\w-]+@+[\w-]+.com\b"
f = open("/home/student/PycharmProjects/4C204/txxt.txt","r")
text = f.read()
print(re.findall(ph,text))
print(re.findall(email,text))