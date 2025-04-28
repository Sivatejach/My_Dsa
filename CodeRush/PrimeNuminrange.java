import java.util.Scanner;

class PrimeNuminrange {
    public static boolean isPrime(int n) {
        if (n <= 1) { //29(false)
            return false;
        }

        for(int i=2;i <= Math.sqrt(n);i++) { //(29) = 5.39
            if (n % i == 0) { //29 % 2 = 1, 29 % 3 = 2, 29 % 4 = 1, 29 % 5 = 4(loop end)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int start = sc.nextInt(); //10
        int end = sc.nextInt(); //20
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }    
}
