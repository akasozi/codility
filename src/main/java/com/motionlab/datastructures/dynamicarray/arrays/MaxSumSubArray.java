package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] arr = {1,-2,3,4,-4,6,-4,3,2}; // {-1,5,-6,9,14,12,-9};
        int meh = 0, msf = Integer.MIN_VALUE, left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            meh = meh + arr[i];
            if (meh < arr[i]) {
                meh = arr[i];
                left = i;
            }
            
            if (msf < meh) {
                msf = meh;
                right = i;
            }
        }
        System.out.println("Maximum Contiguous Sub Array Sum: " + msf);
        printSubArray(arr, left, right);
    }

    public static void printSubArray(int[] arr, int start, int end) {

        System.out.print("[");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[end] +"]");
    }


}
