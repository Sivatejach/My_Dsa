
#Sample Input:
# # 5
# #Sample Output:
# # * * * * *
# # * * * * *
# # * * * * *
# # * * * * *
# # * * * * *


n=int(input("Enter the number of elements in the list: "))
for i in range(n,0,-1):
    print("* "*i)