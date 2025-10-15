package BasicRecursion.FunctionalWay;

import java.util.Scanner;

public class reverseanArrsy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseanArray(arr, 0, n-1);
        System.out.println("Reversed array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void reverseanArray(int[] arr,int l,int r){
        if(l>=r) return;
        swap(arr[l],arr[r]);
        reverseanArray(arr,l+1,r-1);

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

}
