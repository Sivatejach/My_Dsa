package BasicMath;
import java.util.Scanner;

class PrintDivisors {
    public static void printDivisors(int n) {
        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) { // Print the complement divisor if it's different
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println(); // For a new line after printing all divisors
    }   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printDivisors(n);
        scanner.close();
    }
}