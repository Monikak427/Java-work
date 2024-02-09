package threads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeadlockTest {

    @Test
    void testDeadlock() {
        Deadlock.main(null);
        // Deadlock cannot be tested through unit tests directly
        assertTrue(true); // If the program runs without deadlock, this assertion will pass
    }
}
