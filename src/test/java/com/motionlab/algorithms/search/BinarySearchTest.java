package com.motionlab.algorithms.search;

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
class BinarySearchTest {

    BinarySearch underTest;

    @BeforeEach
    void setUp() {
        underTest = new BinarySearch();
    }

    @Test
    @DisplayName("Test should pass")
    void itShouldFindTarget() {
        int[] arr = { 2, 5, 9, 11, 23 };
        int size = arr.length;
        int target = 11;
        Assertions.assertEquals(3, underTest.binarySearch(arr, size, target));
    }

    @Test
    @DisplayName("Test should Throw exception when illegal values are passed")
    void itShouldThrowIllegalArgumentException() {
        int[] arr = {};
        int size = 0;
        int target = 11;

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> underTest.binarySearch(arr, size, target));
        Assertions.assertEquals( "Illegal Argument: Either array size: " + arr.length + ", or size: " + size + " invalid" , exception.getMessage());

    }
}