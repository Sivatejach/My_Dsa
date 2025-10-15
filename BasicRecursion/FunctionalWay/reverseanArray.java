package BasicRecursion.FunctionalWay;


public class reverseanArray {
    static int n=5;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseanArrayusingrecursion(arr, 0, n-1);
        System.out.println("Reversed array using recursion: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseanArrayusingfunctioncall(arr,0,n-1);
        System.out.println();
        System.out.println("Reversed array using two pointers: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        reveranArrayusingsinglepointer(arr,0);
        System.out.println();
        System.out.println("Reversed array using single pointer & recursion: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseanArrayusingrecursionandbacktracking(arr,0,n-1);
        System.out.println();
        System.out.println("Reversed array using recursion & backtracking: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    //In this function the array will be reversed because we are swapping the values in the array
    public static void reverseanArrayusingrecursion(int[] arr,int l,int r){
        if(l>=r) return ;
        swap(arr, l, r);
        reverseanArrayusingrecursion(arr,l+1,r-1);
        

    }

    //In the below function the array will not be reversed because we are swapping the values of a and b but not the values in the array
    public static void reverseanArrayusingfunctioncall(int[] arr,int l,int r){
        while(l<r){
            swap(arr, l, r);
            l++;
            r--;
        }
    }
    //In this function the array will be reversed because we are swapping the values in the array
    public static void reveranArrayusingsinglepointer(int[] arr,int i){
            if(i>=n/2) return;
            swap(arr, i, n - i - 1);
            reveranArrayusingsinglepointer(arr,i+1);
    }
    public static void reverseanArrayusingrecursionandbacktracking(int[] arr,int l,int r){
        if(l>=r) return ;
        reverseanArrayusingrecursionandbacktracking(arr,l+1,r-1);
        swap(arr, l, r);
    }
    //We must pass array as parameter because in java primitive data types are passed by value and non-primitive data types are passed by reference
    //So if we pass array as parameter then the changes made in the function will be reflected in the original array
    //If we don't pass array as parameter then the changes made in the function will not be reflected in the original array
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

