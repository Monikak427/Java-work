package additional;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {

    @Test
    public void testCalculateArraySum() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {-2, 5, 8, -3};

        assertEquals(15, ArraySum.calculateArraySum(array1));
        assertEquals(8, ArraySum.calculateArraySum(array2));
    }
}

