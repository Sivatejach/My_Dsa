

n=int(input("Enter the number of rows: "))

for i in range(0,n):
    print("* "*(n-i)+"  "*(2*i)+" *"*(n-i))

for i in range(0,n):
    print("* "*(i+1)+"  "*(2*(n-i-1))+" *"*(i+1))