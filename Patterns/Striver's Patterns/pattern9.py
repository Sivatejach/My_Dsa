



n=int(input("Enter the number of elements in the list: "))

for i in range(n):
    print(" "*(n-i-1)+"*"*(i+1)+"*"*(i)+" "*(n-i-1))
for i in range(n):
    print(" "*(i)+"*"*(n-i)+"*"*(n-i-1)+" "*(i))
