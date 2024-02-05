package streams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageOfSquaresTest {

    @Test
    public void testAverageOfSquaresOfOddNumbers() {
        int[] inputArray = {1, 2, 3, 4, 5};
        double expectedOutput = (1*1 + 3*3 + 5*5) / 3.0;

        assertEquals(expectedOutput, AverageOfSquares.averageOfSquaresOfOddNumbers(inputArray), 0.0001);
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersEmptyArray() {
        int[] inputArray = {};

        assertEquals(0.0, AverageOfSquares.averageOfSquaresOfOddNumbers(inputArray), 0.001);
    }

    @Test
    public void testAverageOfSquaresOfOddNumbersNoOddNumbers() {
        int[] inputArray = {2, 4, 6, 8};

        assertEquals(0.0, AverageOfSquares.averageOfSquaresOfOddNumbers(inputArray), 0.001);
    }
}

