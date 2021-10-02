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
    @DisplayName("Should add element to the array")
    void itShouldAddElementToDynamicArray() {
        dynamicArray.add(999);
        Assertions.assertFalse(dynamicArray.isEmpty());
        Assertions.assertEquals(1, dynamicArray.size());
        Assertions.assertTrue(dynamicArray.contains(999));
    }

    @Test
    @DisplayName("Should access an element using an index")
    void itShouldGetDynamicArraySize() {
        dynamicArray.add(34);
        dynamicArray.add(33);
        Assertions.assertEquals(2, dynamicArray.size());
        Assertions.assertFalse(dynamicArray.isEmpty());
        Assertions.assertEquals(33, dynamicArray.get(1));
    }

    @Test
    @DisplayName("Should set a new value at the specified index")
    void itShouldSetNewDynamicArrayValue() {
        dynamicArray.add(34);
        dynamicArray.add(33);
        dynamicArray.add(1);
        // Set
        dynamicArray.set(2, 99);
        Assertions.assertEquals(99, dynamicArray.get(2));
        Assertions.assertNotNull(dynamicArray.get(2));
    }

    @Test
    @DisplayName("Should fail when illegal index is specified")
    void itShouldFailWhenIllegalIndexSpecified() {
        dynamicArray.add(34);
        Throwable exception = Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> dynamicArray.set(-1, 999));
        Assertions.assertEquals("Illegal index: " + -1, exception.getMessage());
    }

    @Test
    @DisplayName("Should reset the array and update len to zero")
    void itShouldClearArray() {
        // Populate the array...
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(10);
        // clear the contents of the array
        dynamicArray.clear();
        // Assertions...
        Assertions.assertTrue(dynamicArray.isEmpty());
        Assertions.assertEquals(0, dynamicArray.size());
        Assertions.assertFalse(dynamicArray.contains(10));
    }

    @Test
    @DisplayName("Should pass remove the value at the specified index")
    void itShouldRemoveElementAtSpecifiedIndex() {
        dynamicArray.add(34);
        dynamicArray.add(33);
        dynamicArray.add(1);
        // Set
        Integer elem = dynamicArray.removeAt(1);
        Assertions.assertEquals(2, dynamicArray.size());
        Assertions.assertNotNull(elem);
        Assertions.assertFalse(dynamicArray.contains(33));
    }

    @Test
    @DisplayName("Should pass remove the value at the specified index")
    void itShouldRemoveElement() {
        dynamicArray.add(34);
        dynamicArray.add(33);
        dynamicArray.add(1);
        // Set
        boolean is_success = dynamicArray.remove(1);
        Assertions.assertEquals(2, dynamicArray.size());
        Assertions.assertTrue(is_success);
        Assertions.assertFalse(dynamicArray.contains(1));
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

    @Test
    @DisplayName("Should fail when invalid index specified")
    void itShouldThrowIndexOutOfBoundsExceptionWhenRemoveWithZero() {
        Throwable exception =
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> dynamicArray.removeAt(-1));
        Assertions.assertEquals("Illegal index: " + -1, exception.getMessage());
    }




}