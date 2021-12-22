package com.motionlab.datastructures.dynamicarray.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MatrixSummation {

    public static List<List<Integer>> findMatrix(List<List<Integer>> a) {

        List<List<Integer>> b = new ArrayList<>();

        for (int i =0; i < a.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < a.get(i).size(); j++) {
                if (i == 0) {
                    int k = 0, sum = 0;
                    while (k < a.get(i).size()) {
                        sum += a.get(i).get(k);
                        row.add(sum);
                        k++;
                    }
                    b.add(row);
                }
            }
        }
        return b;
    }

    private static int traverseVertical(List<List<Integer>> a, int rows) {

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= 0; j++) {
                sum += a.get(i).get(j);
            }
        }
        return sum;
    }

    private static void printMatrix(List<List<Integer>> a) {

        System.out.println("AAA");
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        List<Integer> row1= Arrays.asList(1,2,3);
        List<Integer> row2= List.of(4,5,6);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(row1);
        matrix.add(row2);

        List<List<Integer>> b = findMatrix(matrix);
        printMatrix(b);

    }

    private static int sumMatrix(List<List<Integer>> a, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                   sum += a.get(i).get(j);
            }
        }
        return sum;
    }
}
