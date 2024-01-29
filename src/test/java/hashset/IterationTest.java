package hashset;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;

public class IterationTest {

    @Test
    public void testHashSetIteration() {
  
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("Ab");
        stringSet.add("Abc");
        stringSet.add("Abcd");
        stringSet.add("Abcde");
        stringSet.add("Abcdef");
        stringSet.add("Abcdefg");
        stringSet.add("Abcdefgh");
        stringSet.add("Abcdefghi");
        stringSet.add("Abcdefghij");
        stringSet.add("Abcdefghijk");

        assertEquals(10, stringSet.size());

   
        assertTrue(stringSet.contains("Ab"));
        assertTrue(stringSet.contains("Abc"));
        assertTrue(stringSet.contains("Abcd"));
        assertTrue(stringSet.contains("Abcde"));
        assertTrue(stringSet.contains("Abcdef"));
        assertTrue(stringSet.contains("Abcdefg"));
        assertTrue(stringSet.contains("Abcdefgh"));
        assertTrue(stringSet.contains("Abcdefghi"));
        assertTrue(stringSet.contains("Abcdefghij"));
        assertTrue(stringSet.contains("Abcdefghijk"));
    }
}
