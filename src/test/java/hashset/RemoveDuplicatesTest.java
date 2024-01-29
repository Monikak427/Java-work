package hashset;

import org.junit.Test;
import static org.junit.Assert.*;
import hashset.RemoveDuplicates;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates remover = new RemoveDuplicates();

        String input1 = "abbacd";
        String expectedOutput1 = "abcd";
        assertEquals(expectedOutput1, remover.removeDuplicates(input1));
        
        String input2 = "";
        String expectedOutput2 = "";
        assertEquals(expectedOutput2, remover.removeDuplicates(input2));

        String input3 = "abcdef";
        String expectedOutput3 = "abcdef";
        assertEquals(expectedOutput3, remover.removeDuplicates(input3));

  
        String input4 = "abccefg!";
        String expectedOutput4 = "abcefg!"; 
        assertEquals(expectedOutput4, remover.removeDuplicates(input4));

        // Test with a string containing all duplicates
        String input5 = "aaaaa";
        String expectedOutput5 = "a";
        assertEquals(expectedOutput5, remover.removeDuplicates(input5));
    }
}

