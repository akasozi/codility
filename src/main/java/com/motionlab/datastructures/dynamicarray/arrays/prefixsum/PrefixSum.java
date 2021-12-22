package com.motionlab.datastructures.dynamicarray.arrays.prefixsum;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class PrefixSum {

    public static void main(String[] args)  {

        int[] arr = {10, 20, 10, 5, 15};
        int n = arr.length;
        fillPrefixSum(arr, n);
        printArray(arr, n);
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void fillPrefixSum(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}

