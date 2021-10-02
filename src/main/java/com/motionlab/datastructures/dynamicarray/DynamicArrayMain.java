package com.motionlab.datastructures.dynamicarray;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class DynamicArrayMain {

    public static void main(String[] args) {
        DynamicArray<Integer> arr = new DynamicArray<Integer>();
        arr.add(34);
        arr.add(33);
        arr.add(1);

        System.out.println("Contents of Array: " + arr.toString());
    }
}
