package ua.epam.javacore.hometask06;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SetWithMissingNumberTest {

    private SetWithMissingNumber set = new SetWithMissingNumber();


    @Test
    void findMissingNumber_RIGHT_ANSWER() {
        int[] actual = set.findMissingNumber(new int[]{1, 2, 3, 3});
        int[] expected = new int[]{3, 4};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    void findMissingNumber_NOT_NULL() {
        Assert.assertNotNull(set.findMissingNumber(null));
    }
}