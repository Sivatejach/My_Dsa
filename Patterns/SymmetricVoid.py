




n=int(input("Enter the number of elements in the list: "))

for i in range(n):
    for j in range(n):
        if i == j or i + j == n - 1:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()
# This code takes an integer input n and prints a symmetric void pattern of size n x n using asterisks (*) and spaces.