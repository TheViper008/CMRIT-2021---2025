def insertion_sort(lst):
    for x in range(1,len(lst)):
        y = x
        picked = lst[x]
        while picked < lst[y-1] and y > 0:
            lst[y] = lst[y-1]
            y -= 1
        lst[y] = picked

lst = list(map(int,input("Enter the list of numbers:").split()))
insertion_sort(lst)
print("Sorted using insertion sort:")
print(lst)