import hometask02.ContainsAnyDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ContainsAnyDuplicatesTest {

    @Test
    void duplicates() {
        int[] input = {1, 2, 3, 4};
        boolean expect = false;
        boolean result = ContainsAnyDuplicates.duplicates(input);
        assertEquals(expect, result);
    }
}