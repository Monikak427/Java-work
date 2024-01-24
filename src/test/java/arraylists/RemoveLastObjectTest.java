package arraylists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class RemoveLastObjectTest {

    @Test
    void testRemoveLastObject() {
        // Create ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");

        // Call the method to be tested
        RemoveLastObject.removeLastObject(stringList);

        // Check the size of the list after removal
        assertEquals(3, stringList.size());

        // Check the elements of the list after removal
        assertEquals("One", stringList.get(0));
        assertEquals("Two", stringList.get(1));
        assertEquals("Three", stringList.get(2));
    }

    @Test
    void testRemoveLastObjectEmptyList() {
        // Create an empty ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Call the method to be tested
        RemoveLastObject.removeLastObject(stringList);

        // Check that the list is still empty
        assertTrue(stringList.isEmpty());
    }
}

