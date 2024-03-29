package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotationTest {
	@Test
    public void testAreRotations() {
        assertTrue(Rotation.areRotations("abc", "bca"));
    }

    @Test
    public void testAreRotationsDifferentLength() {
        assertFalse(Rotation.areRotations("abcd", "bca"));
    }

    @Test
    public void testAreRotationsEmptyStrings() {
        assertFalse(Rotation.areRotations(null, null));
    }

    @Test
    public void testAreRotationsNullStrings() {
        assertFalse(Rotation.areRotations(null, "abc"));
    }
}
