import java.util.*;


public class Swapnumberwithouttemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        // Using XOR to swap numbers without a temporary variable

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping using XOR: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        // Using multiplication and division to swap numbers without a temporary variable
        sc.close();
    }
}
