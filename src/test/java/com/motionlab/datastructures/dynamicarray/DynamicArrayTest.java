package com.motionlab.datastructures.dynamicarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class DynamicArrayTest {

    @Test
    @DisplayName("Test should pass when a valid index is passed")
    void itShouldGetValueByIndex() {
        DynamicArray<Integer> test_arr = new DynamicArray<>();
        test_arr.add(1);
        test_arr.add(2);
        test_arr.add(10);

        Assertions.assertEquals(10, test_arr.get(2));
    }

    @Test
    @DisplayName("Test should get dynamic array size")
    void itShouldGetDynamicArraySize() {
        DynamicArray<Integer> test_arr = new DynamicArray<>();
        test_arr.add(1);
        test_arr.add(2);
        test_arr.add(10);
        Assertions.assertEquals(3, test_arr.size());
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldSetArrayValue() {
        DynamicArray<Integer> test_arr = new DynamicArray<>();
        test_arr.add(1);
        test_arr.add(2);
        test_arr.add(10);
        // Set
        test_arr.set(2, 99);
        Assertions.assertEquals(99, test_arr.get(2));
    }

    @Test
    void itShouldClear() {
        // Given
        // When
        // Then
    }
}