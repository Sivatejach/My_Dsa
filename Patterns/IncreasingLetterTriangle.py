

#Sample Input/Output:
# 3
#
# A
# A B
# A B C


n=int(input("Enter the number of elements in the list: "))
strval=""

num=65
for i in range(1,n+1):
    num=65
    strval=""
    for j in range(1,i+1):
        strval+=chr(num)+" "
        num+=1
    print(strval)
