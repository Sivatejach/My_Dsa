


#Sample Input:
# 3
#
#1                1
#1 2            1 2
#1 2 3        1 2 3

n=int(input("Enter the number of elements in the list: "))


def reverse(strval):
    strval=strval.split()
    strval.reverse()
    return " ".join(strval)

strval=""
for i in range(1,n+1):
    strval=""
    for j in range(1,i+1):
        strval+=str(j)+" "
    print(strval+"  "*(n-i)+"  "*(n-i)+reverse(strval))

