package ua.epam.javacore.hometask02;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ContainsAnyDuplicatesTest {

    @Test
    void duplicates() {
        ContainsAnyDuplicates duplicates = new ContainsAnyDuplicates();
        int[] input = {1, 2, 3, 4};
        boolean expect = false;
        boolean actual = duplicates.duplicates(input);
        assertEquals(expect, actual);
    }
}