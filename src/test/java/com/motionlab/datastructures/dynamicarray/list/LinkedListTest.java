package com.motionlab.datastructures.dynamicarray.list;

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
class LinkedListTest {

    private LinkedList underTest;

    @BeforeEach
    void setUp() {
        underTest = new LinkedList();
    }

    @Test
    @DisplayName("Test should pass")
    void itShouldAddElementsAtSpecifiedPositon() {
        underTest.insertAt(2, 1);
        Assertions.assertEquals(1, underTest.size());
    }


}