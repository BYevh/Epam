package hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecificTargetTest {

    @Test
    void target() {
        int[] ints = {2, 7, 11, 15};
        int target = 9;
        int[]result = SpecificTarget.target(ints, target);
        int[]expect = {0, 1};
        assertArrayEquals(expect, result);
    }
}