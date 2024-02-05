package streams;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class CapitalizeAndSortStringsTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] inputArray = {"elephant", "dog", "cat", "rabbit"};
        String[] expectedOutput = {"Cat", "Dog", "Elephant", "Rabbit"};

        assertArrayEquals(expectedOutput, CapitalizeAndSortStrings.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortEmptyArray() {
        String[] inputArray = {};
        String[] expectedOutput = {};

        assertArrayEquals(expectedOutput, CapitalizeAndSortStrings.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortSingleElementArray() {
        String[] inputArray = {"apple"};
        String[] expectedOutput = {"Apple"};

        assertArrayEquals(expectedOutput, CapitalizeAndSortStrings.capitalizeAndSort(inputArray));
    }

    @Test
    public void testCapitalizeAndSortAlreadyCapitalized() {
        String[] inputArray = {"Cat", "Dog", "Elephant", "Rabbit"};
        String[] expectedOutput = {"Cat", "Dog", "Elephant", "Rabbit"};

        assertArrayEquals(expectedOutput, CapitalizeAndSortStrings.capitalizeAndSort(inputArray));
    }
}
