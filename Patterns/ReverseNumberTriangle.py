
#Sample Input/Output:
# 3

# 1 2 3
# 1 2
# 1



n=int(input("Enter the number of elements in the list: "))
strval=""
for i in range(n,0,-1):
    strval=""
    for j in range(1,i+1):
        strval+=str(j)+" "
    print(strval)


