def fibo(x):
    if x <= 0:
        print("Invalid Input")
    if x== 1:
        return 0
    elif x ==2:
        return 1
    else:
        return fibo(x-2) + fibo(x-1)

flag = "y"
while(flag=="y"):
    print(fibo(int(input("Enter number-"))))
    flag=input("Do you want to continue?y/n-")
    

