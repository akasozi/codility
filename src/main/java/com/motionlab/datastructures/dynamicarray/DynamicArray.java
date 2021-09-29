package com.motionlab.datastructures.dynamicarray;

import java.util.Iterator;

/**
 * A Generic dynamic array implementation.
 *
 * @author Abu Bizibu, abukasozi@gmail.com
 * @created 29/10/2021
 * @project Datastructures practice
 */
@SuppressWarnings("unchecked")
public class DynamicArray<T>  implements Iterable<T> {

    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArray() {
        this(16);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0)  throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    // O(1)
    public int size() {
        return len;
    }

    // O(1)
    public boolean isEmpty() {
        return size() == 0;
    }

    // O(1)
    public T get(int index) {
        if (index < 0 || index >= len)
            throw new IndexOutOfBoundsException("Illegal index: " + index);
        return arr[index];
    }

    // O(1)
    public void set(int index, T elem) {
        if (index < 0 || index >= len) throw new IndexOutOfBoundsException("Illegal index: " + index);
        arr[index] = elem;
    }
    // O(n)
    public void clear() {
        for (int i = 0; i < len; i++) arr[i] = null;
        len = 0;
    }
    // O(n)
    public void add(T elem) {

        if (len + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else
                capacity *= 2; // double the capacity
            T[] new_arr = (T[]) new Object[capacity];
            for(int i = 0; i < len; i++)
                new_arr[i] = arr[i];
            arr = new_arr;
        }
        arr[len++] = elem;
    }

    public T removeAt(int rm_index) {
        if (rm_index < 0 || rm_index >= len)
            throw new IndexOutOfBoundsException("Illegal index: " + rm_index);
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i  = 0, j = 0; i < len; i++, j++) {
            if (i == rm_index) j--;
            else
                new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --len;
        return data;
    }

    public int indexOf(T elem) {
        for (int i = 0; i < len; i++)
            if (elem.equals(arr[i]))
                return i;
        return -1;
    }

    public boolean remove(T elem) {
        int index = indexOf(elem);
        if (index == -1)
            return false;
        else {
            removeAt(index);
            return true;
        }
    }

    public boolean contains(T elem) {
        return indexOf(elem) != -1;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public String toString() {

        if (len == 0) return "[]";
        else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for (int i = 0; i < len - 1; i++)
                sb.append(arr[i] + ", ");
            return sb.append(arr[len - 1] + "]").toString();
        }
    }

}
