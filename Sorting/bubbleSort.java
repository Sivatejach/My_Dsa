import java.util.*;

//Bubble sort is a basic sorting method for a list of items, where it repeatedly
// compares and swaps adjacent items to move the larger ones to the
// end of the list until the entire list is sorted


//Sample Input: 
// 5 4 3 2 1
//Sample Output:
// 1 2 3 4 5
// Time Complexity: O(n^2)
// Space Complexity: O(1)


// Java program to implement bubble sort
public class bubbleSort{
    public static void BubbleSort(int[] arr, int n) {
        int temp;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr, n);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    }