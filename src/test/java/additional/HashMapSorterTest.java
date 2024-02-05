package additional;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class HashMapSorterTest {

    @Test
    void testSortHashMap() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("one", 1);
        unsortedMap.put("three", 3);
        unsortedMap.put("five", 5);
        unsortedMap.put("two", 2);
        unsortedMap.put("four", 4);

        Map<String, Integer> sortedMap = HashMapSorter.sortHashMap(unsortedMap);

        // Sorted by values: one(1) < two(2) < three(3) < four(4) < five(5)
        assertEquals("one", sortedMap.keySet().toArray()[0]);
        assertEquals("two", sortedMap.keySet().toArray()[1]);
        assertEquals("three", sortedMap.keySet().toArray()[2]);
        assertEquals("four", sortedMap.keySet().toArray()[3]);
        assertEquals("five", sortedMap.keySet().toArray()[4]);
    }
}

