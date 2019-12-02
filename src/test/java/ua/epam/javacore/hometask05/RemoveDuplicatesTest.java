package ua.epam.javacore.hometask05;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ua.epam.javacore.hometask05.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates_NOT_NULL() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Assert.assertNotNull(removeDuplicates.removeDuplicates(null));
    }

    @Test
    void removeDuplicates_RIGHT_ANSWER() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int expected = 4;
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3, 4));
        int actual = removeDuplicates.removeDuplicates(list);
        Assert.assertEquals(expected, actual);
    }

}