


#Sample Input/Output:
# Input: 3
# Output:
#C
#C B
#C B A

# Input: 5
# Output:
#E
#E D
#E D C
#E D C B
#E D C B A

n=int(input("Enter the number of elements in the list: "))

strval=""
num=ord(chr(65+n-1))
print(num)
for i in range(1,n+1):
    eachlevwl=num
    strval=""
    for j in range(i,0,-1):
        strval+=chr(eachlevwl)+" "
        eachlevwl-=1
    print(strval)