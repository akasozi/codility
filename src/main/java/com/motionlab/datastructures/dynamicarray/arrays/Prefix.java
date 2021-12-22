package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class Prefix {

    public static void main(String[] args) {

        int[] arr = {10, 4, 16, 20};
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        printArray(prefixSum);
    }

    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + " ");
        System.out.print(arr[arr.length - 1]);
    }
}
