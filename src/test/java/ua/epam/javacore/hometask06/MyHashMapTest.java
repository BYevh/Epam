package ua.epam.javacore.hometask06;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyHashMapTest {
    MyHashMap myHashMap = new MyHashMap();

    @Before
    public void init() {
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
    }

    @Test
    void put_RETURNS_WHAT_PUT() {
        init();
        int actual = myHashMap.get(1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void get_RETURNS_WHAT_PUT() {
        init();
        int actual = myHashMap.get(2);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void remove_RETURNS_MINUS_ONE() {
        init();
        myHashMap.remove(2);
        int actual = myHashMap.get(2);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void NOT_NULL() {
        Assert.assertNotNull(myHashMap);
    }
}