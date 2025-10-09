



n=int(input("Enter the number of elements in the list: "))


for i in range(n+1):
    print(" "*(i)+"*"*(n-i)+"*"*(n-i-1)+" "*(i))