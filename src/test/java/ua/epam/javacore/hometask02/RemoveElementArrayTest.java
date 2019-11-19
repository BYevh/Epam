package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementArrayTest {

    @Test
    void removeElement() {
        RemoveElementArray removeElementArray = new RemoveElementArray();
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expect = 5;
        int actual = removeElementArray.removeElement(ints, val);
        assertEquals(expect, actual);

    }
}