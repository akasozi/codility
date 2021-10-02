package com.motionlab.datastructures.dynamicarray.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class RemoveDuplicatesHashMap {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 19, 19, 20, 20, 55, 55, 55, 55, 56 };

        RemoveDuplicatesHashMap obj = new RemoveDuplicatesHashMap();
        int n = obj.removeDuplicates(arr, arr.length);
        obj.printArray(arr, n);
    }

    public int removeDuplicates(int arr[], int n) {

        if (n < 0 || n > arr.length)
            throw new IllegalArgumentException("Illegal argument: " + n);

        if (n == 0 || n == 1)
            return n;

        HashMap<Integer, Boolean> hashMap =
                new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hashMap.get(arr[i]) == null) {
                hashMap.put(arr[i], true);

            }
        }

        int j = 0;
        Iterator<Map.Entry<Integer, Boolean>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, Boolean> set = (Map.Entry<Integer, Boolean>) iterator.next();
            arr[j++] = set.getKey();
        }
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
}
