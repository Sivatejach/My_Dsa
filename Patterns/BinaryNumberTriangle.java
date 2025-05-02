
package Patterns;
// Binary Number Triangle
// Given a number n, print the binary number triangle of height n.

// 101
// For ‘i’ from 0 to ‘N’-1:
// For j from 0 to ‘num’-1:
// If ‘i’+’j’ % 2 == 0:
// Print ‘1’
// Else  :
// Print ‘0’
// ‘Num’++



//Sample Input:
// 5
// Sample Output:
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the binary number triangle:");
        int n = sc.nextInt();
        // System.out.println("Binary Number Triangle of height " + n + ":");
        // for (int i = 1; i <= n; i++) {
        //     String binaryNumber = Integer.toBinaryString(i);
        //     for(int j=0;j<binaryNumber.length();j++){
        //         System.out.print(binaryNumber.charAt(j)+" ");
        //     }
        //     System.out.println();
        // }
        // Binary Number Triangle
        int num=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < num; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
            num++;
        }
        sc.close();

    }
     
}