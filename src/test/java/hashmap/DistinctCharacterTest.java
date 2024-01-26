package hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DistinctCharacterCounterTest {

    @Test
    void testCountDistinctCharacters() {
        String input = "test string";
        String result = DistinctCharacter.countDistinctCharacters(input);

        assertEquals("t-3, e-1, s-2, r-1, i-1, n-1, g-1", result);
    }

    @Test
    void testCountDistinctCharactersEmptyString() {
        String input = "";
        String result = DistinctCharacter.countDistinctCharacters(input);

        assertEquals("", result);
    }

    @Test
    void testCountDistinctCharactersSingleCharacter() {
        String input = "a";
        String result = DistinctCharacter.countDistinctCharacters(input);

        assertEquals("a-1", result);
    }
}

