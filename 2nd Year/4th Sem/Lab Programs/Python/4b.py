romdic = {
      'I': 1,
      'V': 5,
      'X': 10,
      'L': 50,
      'C': 100,
      'D': 500,
      'M': 1000
}

num = input("Enter Roman Numeral:")
intval = 0

for i in range(len(num)):
    if i > 0 and romdic[num[i]]>romdic[num[i-1]]:
      intval += romdic[num[i]]-2 * romdic[num[i-1]]
    else:
      intval += romdic[num[i]]

print(intval)