package BasicRecursion.FunctionalWay;


// In this Functional Approach we are returning the sum of n numbers
// Here we are using function return type to store the sum
// This is also called Head Recursion

import java.util.Scanner;
public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = printsumofN(n);
        System.out.println(sum);
        sc.close();
    }
    public static int printsumofN(int n) {
        if(n==0) {
            return 0;
        }
        return n + printsumofN(n-1);
    }
}