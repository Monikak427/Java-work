package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleEvenNumbersTest {

    @Test
    void testDoubleEvenNumbers() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expectedOutput = Arrays.asList(4, 8, 12);

        List<Integer> result = DoubleEvenNumbers.doubleEvenNumbers(inputList);
        assertEquals(expectedOutput, result);
    }
}
