package ua.epam.javacore.hometask06;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DuplicatesIndicesTest {

    @Test
    void findDuplicatesIndices_TRUE() {
        DuplicatesIndices indices = new DuplicatesIndices();
        int[] ints = {1, 2, 3, 1};
        Assert.assertTrue(indices.findDuplicatesIndices( ints,3));
    }

    @Test
    void findDuplicatesIndices_FALSE() {
        DuplicatesIndices indices = new DuplicatesIndices();
        int[] ints = {1, 2, 3, 4};
        Assert.assertFalse(indices.findDuplicatesIndices( ints,3));
    }

    @Test
    void findDuplicatesIndices_NOT_NULL() {
        DuplicatesIndices indices = new DuplicatesIndices();
        Assert.assertFalse(indices.findDuplicatesIndices( null,0));
    }
}