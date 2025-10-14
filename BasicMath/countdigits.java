package BasicMath;

import java.util.Scanner;
public class countdigits {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int val=n;
        System.out.println("n value is " + n);
        int rem;
        while(temp!=0){
           rem=temp%10;
           if (rem != 0 && val % rem == 0) {  // Avoid division by zero
            count++;
        }
            temp=temp/10;
        }
        System.out.println("The number of digits that divide " + n + " is: " + count);
        sc.close();
    }
}