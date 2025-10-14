import java.util.Scanner;


//gcd (a,b)=gcd(b,a%b) when a>b
//gcd(a,b)=gcd(a,b%a) when b>a
// if a==0 return b
// if b==0 return a

public class EuclidianAlgo {
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else if(a == 0) {
            return b;
        }
        else if(a > b) {
            return gcd(b, a % b);
        } else {
            return gcd(a, b % a);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if(num1 < 0 || num2 < 0){
            System.out.println("Please enter non-negative integers.");
            scanner.close();
            return;
        }

        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}
