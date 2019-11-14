import hometask02.SumSubArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumSubArrayTest {

    @Test
    void sumSubArray() {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect = 6;
        int result = SumSubArray.sumSubArray(ints);
        assertEquals(expect, result);
    }
}