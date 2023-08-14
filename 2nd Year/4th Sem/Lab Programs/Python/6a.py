filename = input("Enter the filename: ")
file = open(filename, "r")
n = int(input("Enter the number of lines to display: "))
for i in range(n):
    line = file.readline()
    print(line)
file.seek(0)    #to go to the starting point 
word = input("Enter the word to search for: ")   
count = 0
for line in file:
    if word in line:
        count += 1
print(f"The word {word} appears {count} times in the file.")