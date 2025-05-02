package Patterns;
//Sample Input:
// 5
// Sample Output:
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.Scanner;

public class BinarynumbertoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the binary number triangle:");
        
        int n = sc.nextInt();
        System.out.println("Binary Number Triangle of height " + n + ":");
        for (int i = 1; i <= n; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            for(int j=0;j<binaryNumber.length();j++){
                System.out.print(binaryNumber.charAt(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
