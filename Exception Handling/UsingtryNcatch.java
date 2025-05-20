import java.util.Scanner;
public class UsingtryNcatch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try{
               
                int n = sc.nextInt();
                if (n < 18 || n > 60) {
                    throw new ArithmeticException("Age must be between 18 and 60");
                }
                System.out.println("Program continues after exception handling.");
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
