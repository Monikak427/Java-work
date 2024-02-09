package threads;

import org.junit.jupiter.api.Test;

public class TwoThreadsTest {

    @Test
    public void testPrintNumbers() throws InterruptedException {
        TwoThreads twoThreads = new TwoThreads();

        Thread evenThread = new Thread(() -> {
            twoThreads.printNumbers();
        });

        Thread oddThread = new Thread(() -> {
            twoThreads.printNumbers();
        });

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }
}
