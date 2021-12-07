package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70 };
        // Number of rotations
        int k = 2;
        int n = arr.length;
        reverseArray01(arr, 0, k - 1);
        reverseArray01(arr, k, n - 1);
        reverseArray01(arr, 0, n - 1);

        printArray(arr);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("Reversed Array: [");
        for (int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1] + "]");
    }

    public static void reverseArray01(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


}
