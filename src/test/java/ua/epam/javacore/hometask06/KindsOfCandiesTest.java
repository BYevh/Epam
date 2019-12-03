package ua.epam.javacore.hometask06;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KindsOfCandiesTest {

    @Test
    void kindsOfCandies_RIGHT_ANSWER() {
        KindsOfCandies candies = new KindsOfCandies();
        int actual = candies.kindsOfCandies(new int[]{1, 2, 3, 4});;
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void kindsOfCandies_NOT_NULL() {
        KindsOfCandies candies = new KindsOfCandies();
        Assert.assertNotNull(candies.kindsOfCandies(null));
    }
}