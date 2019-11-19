package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneToArrayTest {


    @Test
    void plusToArray() {
        PlusOneToArray plusOneToArray = new PlusOneToArray();
        int[] ints = {9, 9, 9, 9, 9};
        int[]actual = plusOneToArray.plusToArray(ints);
        int[]expect = {1, 0, 0, 0, 0, 0};
        assertArrayEquals(expect, actual);
    }
}