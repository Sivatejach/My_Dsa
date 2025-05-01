

n=int(input("Enter the number of elements in the list: "))
strval=""
for i in range(1,n+1):
    strval=""
    for j in range(1,i+1):
        strval+=str(i)+" "
    print(strval)
    