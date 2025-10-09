


n=int(input("Enter the number of elements in the list: "))


for i in range(1,n*2,2):
    print(" "*(2*n-i-1)+"*"*i+" "*(2*n-i-1))


for i in range(2*n-1,0,-2):
    print(" "*(2*n-i-1)+"*"*i+" "*(2*n-i-1))

#Sample Input:
# 5
#Sample Output:
#         *
#        ***
#       *****
#      *******
