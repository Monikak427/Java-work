package arraylists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class ArrayListToArrayTest {

    @Test
    void testArrayListToArrayConversion() {
        // Create ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Blue");

        // Call the method to be tested
        String[] stringArray = ArrayListToArray.convertArrayListToArray(stringList);

        // Check the size of the array
        assertEquals(3, stringArray.length);

        // Check each element of the array
        assertEquals("Red", stringArray[0]);
        assertEquals("Green", stringArray[1]);
        assertEquals("Blue", stringArray[2]);
    }

    @Test
    void testArrayListToArrayConversionEmptyList() {
        // Create an empty ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Call the method to be tested
        String[] stringArray = ArrayListToArray.convertArrayListToArray(stringList);

        // Check that the array is empty
        assertEquals(0, stringArray.length);
    }
}
