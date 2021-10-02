package com.motionlab.datastructures.dynamicarray.arrays;

import com.motionlab.datastructures.dynamicarray.DynamicArray;
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
class RemoveDuplicateExtraSpaceTest {


    RemoveDuplicateExtraSpace underTest;

    @BeforeEach
    void setUp() {

        underTest = new RemoveDuplicateExtraSpace();
    }

    @Test
    @DisplayName("Test should pass")
    void itShouldRemoveDuplicates() {
        int[] arr = {2,2,2,2};
        Assertions.assertEquals(1, underTest.removeDuplicates(arr, 4));
    }
}