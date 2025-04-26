

import java.util.Arrays;
import java.util.Scanner;

public class FirstNLastPosi {

    public static int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }   
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
        sc.close();
    }
}