package com.motionlab.datastructures.dynamicarray.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
class RemoveDuplicatesHashMapTest {

    RemoveDuplicatesHashMap underTest;

    @BeforeEach
    void setUp() {
        underTest = new RemoveDuplicatesHashMap();
    }

    @Test
    void itShouldRemoveDuplicates() {
        int[] arr = { 1, 1, 5, 5, 9, 9 };
        Assertions.assertEquals(3, underTest.removeDuplicates(arr, arr.length));
    }

    @Test
    void itShouldThrowIllegalArgumentException() {
        int[] arr = { 1, 1, 5, 5, 9, 9 };

        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> underTest.removeDuplicates(arr, -1));

        Assertions.assertEquals("Illegal argument: " + -1, exception.getMessage());
    }
}