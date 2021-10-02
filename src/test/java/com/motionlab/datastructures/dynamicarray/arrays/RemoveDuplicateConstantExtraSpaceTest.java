package com.motionlab.datastructures.dynamicarray.arrays;

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
class RemoveDuplicateConstantExtraSpaceTest {

    RemoveDuplicateConstantExtraSpace underTest;
    @BeforeEach
    void setUp() {
        underTest = new RemoveDuplicateConstantExtraSpace();
    }

    @Test
    @DisplayName("Test should pass")
    void itShouldRemoveDuplicates() {
        int[] arr = {2, 2, 3, 3};
        Assertions.assertEquals(2, underTest.removeDuplicates(arr, 4));
    }

    @Test
    @DisplayName("Test should pass")
    void itShouldThrowIllegalArgumentException() {
        int[] arr = {2, 2, 3, 3};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> underTest.removeDuplicates(arr, -1));
        Assertions.assertEquals("Illegal argument: " + -1, exception.getMessage());
    }
}