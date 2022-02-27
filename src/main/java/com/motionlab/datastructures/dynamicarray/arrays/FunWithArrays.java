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

    // [1,2,3,0,0,0]
    // 3
    // [2,5,6]
    // 3
    // Expected output
    //
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;
        int length = nums1.length;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                int temp = nums1[i];
                nums1[k] = temp;
                i++;
                k++;
            } else {
                int temp = nums2[j];
                for (int v = length - 2; v >= k; v--)
                    nums1[v+1] = nums1[v];
                nums1[k] = temp;
                j++;
                k++;
            }
        }

        while ( i < m) {
            nums1[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
}
