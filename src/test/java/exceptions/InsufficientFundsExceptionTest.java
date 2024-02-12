package exceptions;
import org.junit.Test;
import exceptions.InsufficientFundsException;

import static org.junit.Assert.assertEquals;

public class InsufficientFundsExceptionTest {

    @Test
    public void testExceptionMessage() {
        String message = "Insufficient funds";
        InsufficientFundsException exception = new InsufficientFundsException(message);
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testCustomMessage() {
        String message = "Not enough money in the account";
        InsufficientFundsException exception = new InsufficientFundsException(message);
        assertEquals(message, exception.getMessage());
    }
}
