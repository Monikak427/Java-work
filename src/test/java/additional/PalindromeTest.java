package additional;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(121));
        assertTrue(Palindrome.isPalindrome(1221));
        assertFalse(Palindrome.isPalindrome(12345));
    }
}
