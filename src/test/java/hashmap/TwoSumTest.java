package hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testFindTwoSumIndices() {
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = TwoSum.findTwoSumIndices(input, target);

        assertArrayEquals(new int[]{3, 5}, result);
    }

    @Test
    void testFindTwoSumIndicesNoSolution() {
        int[] input = {10, 20, 30, 40, 50, 60};
        int target = 200;

        int[] result = TwoSum.findTwoSumIndices(input, target);

        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testFindTwoSumIndicesEmptyArray() {
        int[] input = {};
        int target = 100;

        int[] result = TwoSum.findTwoSumIndices(input, target);

        assertArrayEquals(new int[]{-1, -1}, result);
    }
}

