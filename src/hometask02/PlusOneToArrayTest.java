package hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneToArrayTest {

    @Test
    void plusToArray() {
        int[] ints = {9, 9, 9, 9, 9};
        int[]result = PlusOneToArray.plusToArray(ints);
        int[]expect = {1, 0, 0, 0, 0, 0};
        assertArrayEquals(expect, result);
    }
}