package BasicRecursion.ParameterisedWay;


// In this Paramterized Approach we are just pritning the sum when n becomes 0
// Here we are passing an extra parameter sum to store the sum till now
//We are not using function return type to store the sum

// This is also called Tail Recursion

import java.util.Scanner;

public class sumofNnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printsumofN(n,0);
        sc.close();
    }

    public static void printsumofN(int n,int sum) {
        if(n==0) {
            System.out.println(sum);
            return;
        }
        printsumofN(n-1,sum+n);
    }
}
