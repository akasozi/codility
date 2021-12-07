package com.motionlab.algorithms.search;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class BinarySearch {

    // Time Complexity O(log n)
    public int binarySearch(int[] arr, int size, int target) {
        // Bounds check
        if (arr.length == 0 || size <= 0) {
            throw new IllegalArgumentException("Illegal Argument: Either array size: " + arr.length + ", or size: " + size + " invalid");
        }

        int lo = 0;
        int hi = size - 1;
        int mid;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}
