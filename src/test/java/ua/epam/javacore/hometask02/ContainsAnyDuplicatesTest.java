package ua.epam.javacore.hometask02;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ContainsAnyDuplicatesTest {

    ContainsAnyDuplicates duplicates = new ContainsAnyDuplicates();

    @Test
    void duplicates() {
        int[] input = {1, 2, 3, 4};
        boolean expect = false;
        boolean actual = duplicates.duplicates(input);
        assertEquals(expect, actual);
    }

    @Test
    public void duplicates_NULL() {
        boolean expect = false;
        boolean actual = duplicates.duplicates(null);
        assertEquals(expect, actual);

    }
}