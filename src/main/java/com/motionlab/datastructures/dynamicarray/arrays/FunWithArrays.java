package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class FunWithArrays {

    public static void main(String[] args) {

        int[] arr = new int[6];
        int length = 0;
        // insert at the end
        // insert at the start
        // insert at a given index

    }

    // This method duplicates the first occurence of 0
    // input: [1,0,2,3,0,4,5,0]
    // expected output: [1,0,0,2,3,0,0,4]
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = length - 2; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                if (i < length - 1) {
                    arr[i] = 0;
                }
                i++; // skip the next element
            }
        }
    }
}
