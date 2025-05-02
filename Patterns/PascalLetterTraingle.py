#Sample code to print Pascal's triangle with letters
#Sample Input:
# 3
#Sample Output:
#     A
#   A B A
# A B C B A

n=int(input("Enter the number of elements in the list: "))

strval=""
num=65
eachlevel=65
for i in range(1,n+1):
    eachlevel=65
    strval=""
    for j in range(eachlevel,num+1):
        strval+=chr(j)+" "
    for k  in range(num-1,eachlevel-1,-1):
        strval+=chr(k)+" "
    num+=1
    print("  "*(n-i)+strval+"  "*(n-i))