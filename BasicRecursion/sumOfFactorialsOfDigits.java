package BasicRecursion;

import java.util.Scanner;

public class sumOfFactorialsOfDigits {
     public static int Fact(int n){
        if(n==0 || n==1) return 1;
        return n*Fact(n-1);
    }
    public static int sumOfFactorialsOfDigitsmethod(int n) {
        if(n%10==n) return Fact(n);
        return Fact(n%10)+sumOfFactorialsOfDigitsmethod(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Sum of Factorials of Digits: " + sumOfFactorialsOfDigitsmethod(n));
        sc.close();
    }
}
