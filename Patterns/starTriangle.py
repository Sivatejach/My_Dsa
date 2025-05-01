


# Problem link : https://bit.ly/3GzvAAa

#Sample Input:
#3
#Sample Output:
#     *
#   * * *
# * * * * *
n=int(input("Enter the number of elements in the list: "))

for i in range(1,n*2,2):
    print(" "*(2*n-i-1)+"*"*i+" "*(2*n-i-1))