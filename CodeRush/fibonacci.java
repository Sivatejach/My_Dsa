import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        if(n==1)   {
            System.out.println("Fibonacci Series: " + a);
        } else if(n==2) {
            System.out.println("Fibonacci Series: " + a + ", " + b);
        }
            else{
                System.out.print("Fibonacci Series: " + a + ", " + b);
                for (int i = 2; i < n; i++) {
                    int c = a + b;
                    System.out.print(", " + c);
                    a = b;
                    b = c;
                }
            }
            sc.close();
        }
       
    }