package com.motionlab.datastructures.dynamicarray.arrays.prefixsum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class EquilibriumIndex {

    public static void main(String[] args) {

        // int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr = {2, -2, -3, 3};
        EquilibriumIndex obj = new EquilibriumIndex();
        // List<Integer> result = obj.equilibrium(arr, arr.length);
        // for (int i = 0; i < result.size(); i++)
        //     System.out.println("Result: " + result.get(i));
        System.out.println("Result: " + obj.equilibrium02(arr, arr.length));
    }

    private List<Integer> equilibrium(int[] arr, int n) {

          List<Integer> result = new ArrayList<>();
          int i, j;
          int leftsum, rightsum;

          for (i = 0; i < n; i++) {
              leftsum = 0;
              for ( j = 0; j < i; j++)
                 leftsum += arr[j];

            rightsum = 0;
            for (j = i; j < n; j++)
                rightsum += arr[j];

            if (leftsum == rightsum) {
                result.add(i);
            }
          }
          return result;
    }

    private int equilibrium02(int[] arr, int n) {

        int[] front = new int[n];
        int[] back = new int[n];

        front[0] = arr[0];
        for (int i = 1; i < n; i++)
            front[i]  = front[i - 1] + arr[i];

        back[n-1] = arr[n-1];
        for(int i = n - 2; i >= 0; i--) {
            back[i] = arr[i] + back[i + 1];
        }

        // for (int i = 0; i < n; i++)
        //     System.out.print(back[i] + " ");

        for (int i = 0; i < n; i++) {
            if (front[i] == back[i])
                return i;
        }
        return -1;
    }
}
