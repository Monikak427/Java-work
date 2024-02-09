package threads;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        assertEquals(instance1, instance2);
    }
}

