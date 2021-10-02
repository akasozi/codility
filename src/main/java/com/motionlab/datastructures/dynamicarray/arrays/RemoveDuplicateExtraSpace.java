package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu, abukasozi@gmail.com
 * @created 02/10/2021
 * @project Common Array questions
 */
public class RemoveDuplicateExtraSpace {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        RemoveDuplicateExtraSpace obj = new RemoveDuplicateExtraSpace();

        int n = obj.removeDuplicates(arr, 9);
        obj.printArray(arr, n);
    }

    public void printArray(int[] arr, int n) {
        if (n == 0)
            System.out.println("[]");
        else {
            StringBuilder sb = new StringBuilder(n).append("[");
            for (int i = 0; i < n - 1; i++)
                sb.append(arr[i] + ", ");
            System.out.println(sb.append(arr[n - 1] + "]"));
        }
    }

    public int removeDuplicates(int[] arr, int n) {

        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
        }

        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
        return j;

    }
}
