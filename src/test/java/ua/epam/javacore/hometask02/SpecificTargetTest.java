package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecificTargetTest {

    @Test
    void target() {
        SpecificTarget specificTarget = new SpecificTarget();
        int[] ints = {2, 7, 11, 15};
        int target = 9;
        int[]actual = specificTarget.target(ints, target);
        int[]expect = {0, 1};
        assertArrayEquals(expect, actual);
    }

    @Test
    void target_NULL() {
        SpecificTarget specificTarget = new SpecificTarget();
        int[] ints = null;
        int target = 0;
        int[]actual = specificTarget.target(ints, target);
        int[]expect = new int[0];
        assertArrayEquals(expect, actual);
    }
}