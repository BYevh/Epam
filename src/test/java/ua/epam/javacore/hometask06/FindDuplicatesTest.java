package ua.epam.javacore.hometask06;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {

    @Test
    void findDuplicates_TRUE() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Assert.assertTrue(findDuplicates.findDuplicates(Arrays.asList(1,2,3,4,4)));
    }

    @Test
    void findDuplicates_FALSE() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Assert.assertFalse(findDuplicates.findDuplicates(Arrays.asList(1,2,3,4)));
    }

    @Test
    void findDuplicates_NOT_NULL() {
        FindDuplicates findDuplicates = new FindDuplicates();
        Assert.assertNotNull(findDuplicates.findDuplicates(Arrays.asList(1,2,3,4,4)));
    }
}