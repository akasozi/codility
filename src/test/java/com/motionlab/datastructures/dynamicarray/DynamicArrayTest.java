package com.motionlab.datastructures.dynamicarray;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class DynamicArrayTest {

    DynamicArray dynamicArray;

    @BeforeEach
    void setUp() {
       dynamicArray = new DynamicArray();
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
    }

    @Test
    @DisplayName("Test should pass when valid index passed")
    void itShouldThrowIndexOutOfBoundsException() {
        Throwable exception =
                Assertions.assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.get(100));
        Assertions.assertEquals("Illegal index: " + 100, exception.getMessage());
    }
}