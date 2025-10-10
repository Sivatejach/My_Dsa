


n=int(input("Enter the number of rows: "))
ch='A'
#Space
for i in range(0,n):
    ch='A'
    for j in range(0,n-i-1):
        print(" ",end="")
    #Star
    bp=((2*i)+1)//2
    for k in range(1,2*i+2):
        print(ch,end="")
        if k<=bp:
            ch=chr(ord(ch)+1)
        else:
            ch=chr(ord(ch)-1)
    print()
