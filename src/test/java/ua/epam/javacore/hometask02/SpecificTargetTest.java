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
}