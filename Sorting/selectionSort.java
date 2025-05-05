
// Selection Sort in Java
// Time Complexity: O(n^2)
// Space Complexity: O(1)


//Ietrative Selection Sort
// 1. Iterate through the array and find the minimum element in the unsorted part of the array.
// 2. Swap the found minimum element with the first element of the unsorted part of the array.
// 3. Repeat the process for the rest of the array until the array is sorted.
// 4. The array is sorted when all elements are in their correct position.

//Sample Input:
// 5 4 3 2 1
//Sample Output:
// 1 2 3 4 5


// Java program to implement selection sort
import java.util.Scanner;


public class selectionSort{

    public static void SelectionSort(int[] arr, int n)
    {
        int minindex;
        int temp;
        for(int i=0;i<n-1;i++){
            minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;
            }
        }    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();

    }
}