package com.motionlab.datastructures.dynamicarray.arrays.prefixsum;

import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class FairIndices {

    public static void main(String[] args) {
       int[] A = {2, -2, -3, 3};
       int[] B = {0, 0, 4, -4};

       int result = fairIndexesArray(A, B);
       System.out.println("Number of Fair indexes found: " + result);
    }


    public static long fairIndexWorking(List<Integer> A, List<Integer> B) {

        long[] sum1 = new long[A.size()];
        long[] sum2 = new long[B.size()];
        for (int i = 0; i < sum2.length; i++) {
            if (i == 0){
                sum1[i] = A.get(i);
                sum2[i] = B.get(i);
            }else{
                sum1[i] = sum1[i-1] + A.get(i);
                sum2[i] = sum2[i-1] + B.get(i);
            }
        }
        if (sum1[sum1.length-1] != sum2[sum2.length-1] || sum1[sum1.length-1] % 2 != 0) {
            return 0;
        }
        long sum = sum1[sum1.length-1]/2;
        int cnt = 0;
        for (int i = 0; i < sum2.length-1; i++) {
            if (sum1[i] == sum2[i] && sum1[i] == sum){
                cnt++;
            }
        }
        return cnt;
    }

    public static int fairIndexesArray(int[] A, int[] B) {
        int i = 0, j = 0;
        int left_sum_a = 0, left_sum_b = 0, right_sum_a = 0, right_sum_b;
        int n = A.length;
        int fairIndexCounter = 0;
        // Assumption both arrays are the same length
        for (i = 0; i < A.length; i++) {
            left_sum_a = left_sum_b = 0;
            for (j = 0; j < i; j++) {
                left_sum_a += A[j];
                left_sum_b += B[j];
            }

            right_sum_a = right_sum_b = 0;
            for (j = i; j < n; j++) {
                right_sum_a += A[j];
                right_sum_b += B[j];
            }

            if (left_sum_a == left_sum_b && right_sum_a == right_sum_b && ((left_sum_a + left_sum_b) == (right_sum_a + right_sum_b))
              && i > 0) {
                System.out.println("Found fair index: " + i);
                fairIndexCounter +=1;
            }
        }

        return fairIndexCounter;
    }


}
