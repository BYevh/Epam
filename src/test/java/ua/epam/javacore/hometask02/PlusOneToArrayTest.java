package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneToArrayTest {

    PlusOneToArray plusOneToArray = new PlusOneToArray();

    @Test
    void plusToArray() {
        int[] ints = {9, 9, 9, 9, 9};
        int[]actual = plusOneToArray.plusToArray(ints);
        int[]expect = {1, 0, 0, 0, 0, 0};
        assertArrayEquals(expect, actual);
    }

    @Test
    void plusToArray_NULL() {
        int[] ints = {9, 9, 9, 9, 9};
        int[]actual = plusOneToArray.plusToArray(null);
        int[]expect = new int[0];
        assertArrayEquals(expect, actual);
    }
}