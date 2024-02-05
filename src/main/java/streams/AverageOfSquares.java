package streams;

import java.util.Arrays;

public class AverageOfSquares {

    public static double averageOfSquaresOfOddNumbers(int[] input) {
        return Arrays.stream(input)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};

        double result = averageOfSquaresOfOddNumbers(inputArray);

        System.out.println("Average of squares of odd numbers: " + result);
    }
}
