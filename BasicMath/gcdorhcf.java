package BasicMath;
import java.util.Scanner;

public class gcdorhcf {
    public static int gcd(int a, int b) {
        //Swapping to make sure a is the smaller number
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1; // If no common divisor is found, return 1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = gcd(num1, num2);
        System.out.println("The GCD (HCF) of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}