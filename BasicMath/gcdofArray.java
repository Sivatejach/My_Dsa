package BasicMath;

import java.util.Scanner;

public class gcdofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
        }
        System.out.println("The GCD of the array elements is: " + result);
        scanner.close();

    }
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
}
