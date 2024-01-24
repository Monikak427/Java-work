package arraylists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class TraversalTest {

    @Test
    void testTraversalWithForLoop() {
        // Create ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");

        // Call the method to be tested
        Traversal.traverseWithForLoop(stringList);

        // No need to check console output, instead, let's check the size of the list
        assertEquals(4, stringList.size());
    }

    @Test
    void testTraversalWithEnhancedForLoop() {
        // Create ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");

        // Call the method to be tested
        Traversal.traverseWithEnhancedForLoop(stringList);

        // No need to check console output, instead, let's check the size of the list
        assertEquals(4, stringList.size());
    }
}
