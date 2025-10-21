package Hashing;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class ArrFreqCount {
    public static  void UsingTwoLoops(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    public static void UsingHashMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();


        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements separated by space:");
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println("Using Two Loops:");
        UsingTwoLoops(arr);
        System.out.println("Using HashMap:");
        UsingHashMap(arr);
    }
    
}
