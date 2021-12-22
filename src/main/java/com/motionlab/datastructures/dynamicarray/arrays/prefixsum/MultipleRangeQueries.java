package com.motionlab.datastructures.dynamicarray.arrays.prefixsum;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MultipleRangeQueries {

    public static void main(String[] args) {
        int[] A = {3, 6, 2, 8, 9, 2};
        int[][] q =   {
                {2, 3},
                {4, 5},
                {1, 5},
                {3, 5}
        };
        results(A, q);
    }

    public static int[][] results(int[] A, int[][] queries) {

        int n = queries.length;
        int[][] result = new int[n][3];
        // Calculate the prefix sum
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }

        // Iterate through the queries and extract the sum
        for (int i = 0; i < n; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int range_sum = A[right] - A[left -1];
            result[i] = new int[] {left, right, range_sum};
            System.out.println("range sum["+ left + ", " + right + "] is " + range_sum);
        }
        return result;
    }
}
