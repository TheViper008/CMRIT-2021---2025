# Write a program that takes a sentence of words as input.
#Removing all duplicate words and print the remaining words sorting them alpjanumerically

sentence = input("Enter a sentence: ")
updated = set(sentence.split())
updated = sorted(updated)

print("Alphanumerically Sorted Words from the List - ")
for word in updated:
    print(word)