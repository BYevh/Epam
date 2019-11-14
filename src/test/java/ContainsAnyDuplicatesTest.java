import hometask02.ContainsAnyDuplicates;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ContainsAnyDuplicatesTest {

    @org.junit.jupiter.api.Test
    void duplicates() {
        int[] input = {1, 2, 3, 4};
        boolean expect = false;
        boolean result = ContainsAnyDuplicates.duplicates(input);
        assertEquals(expect, result);
    }
}