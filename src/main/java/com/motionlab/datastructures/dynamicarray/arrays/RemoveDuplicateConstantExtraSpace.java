package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class RemoveDuplicateConstantExtraSpace {

    public int removeDuplicates(int[] arr, int n) {

        if (n < 0 || n > arr.length)
            throw new IllegalArgumentException("Illegal argument: " + n);

        if (n == 0 || n == 1)
            return n;

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
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

    public static void  main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7};
        RemoveDuplicateConstantExtraSpace test = new RemoveDuplicateConstantExtraSpace();
        int n = test.removeDuplicates(arr, 9);
        System.out.println("Response: " + n);
        test.printArray(arr, n);
    }

}
