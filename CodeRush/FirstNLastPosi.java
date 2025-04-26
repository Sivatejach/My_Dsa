

import java.util.Arrays;
import java.util.Scanner;

public class FirstNLastPosi {

    public static int[] searchRange(int[] nums, int target) {
        //TC : 0(N)
        int first = -1;
        int last = -1;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};

        //TC: 0(N LOG N)
        //int first = firstOcc(nums, target);
        //int last = lastOcc(nums, target);
        //return new int[]{first, last};
    }

    /*public static int firstOcc(int[] nums, int target) {
        int start = 0, end = nums.length - 1, first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    public static int lastOcc(int[] nums, int target) {
        int start = 0, end = nums.length - 1, last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }*/

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