package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSubArrayTest {

    @Test
    void sumSubArray() {
        SumSubArray sumSubArray = new SumSubArray();
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect = 6;
        int actual = sumSubArray.sumSubArray(ints);
        assertEquals(expect, actual);
    }

    @Test
    void sumSubArray_NULL() {
        SumSubArray sumSubArray = new SumSubArray();
        int[] ints = null;
        int expect = 0;
        int actual = sumSubArray.sumSubArray(ints);
        assertEquals(expect, actual);
    }
}