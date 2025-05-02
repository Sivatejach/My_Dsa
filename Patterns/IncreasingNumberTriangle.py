


#Sample Input:
# 3
#
# 1
# 2 3
# 4 5 6

n=int(input("Enter the number of elements in the list: "))
strval=""
num=1
for i in range(1,n+1):
    strval=""
    for j in range(1,i+1):
        strval+=str(num)+" "
        num+=1
    print(strval)
