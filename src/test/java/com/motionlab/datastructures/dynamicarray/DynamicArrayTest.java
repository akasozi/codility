package com.motionlab.datastructures.dynamicarray;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for the Generic Dynamic Array implementation
 *
 * @author Abu Bizibu, abukasozi@gmail.com
 * @created 29/09/2021
 * @project codility
 */
class DynamicArrayTest {

    DynamicArray<Integer> dynamicArray;

    @BeforeEach
    void setUp() {
       dynamicArray = new DynamicArray<Integer>();
    }

    @Test
    @DisplayName("Test should pass when a valid index is passed")
    void itShouldGetValueByIndex() {

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        Assertions.assertEquals(10, dynamicArray.get(2));
    }

    @Test
    @DisplayName("Test should get dynamic array size")
    void itShouldGetDynamicArraySize() {

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        Assertions.assertEquals(3, dynamicArray.size());
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldSetArrayValue() {

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        // Set
        dynamicArray.set(2, 99);
        Assertions.assertEquals(99, dynamicArray.get(2));
        Assertions.assertNotNull(dynamicArray.get(2));
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldClearArray() {
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        // Set
        dynamicArray.set(2, 99);
        dynamicArray.clear();
        Assertions.assertEquals(0, dynamicArray.size());
        Assertions.assertTrue(dynamicArray.isEmpty());
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldRemoveElementAtSpecifiedIndex() {
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        // Set
        Integer elem = dynamicArray.removeAt(1);
        Assertions.assertEquals(2, dynamicArray.size());
        Assertions.assertNotNull(elem);
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldReturnIndexOf() {
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        // Set
        // Integer elem = dynamicArray.indexOf(10)
        Assertions.assertEquals(2, dynamicArray.indexOf(10));
        Assertions.assertEquals(-1, dynamicArray.indexOf(11));
        // Assertions.assertNotNull(elem);
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldThrowIndexOutOfBoundsException() {
        Throwable exception =
                Assertions.assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.get(100));
        Assertions.assertEquals("Illegal index: " + 100, exception.getMessage());
    }


}