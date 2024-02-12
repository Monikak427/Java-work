package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvalidWithdrawalExceptionTest {

    @Test
    void testExceptionMessage() {
        String errorMessage = "Withdrawal amount cannot be negative";
        InvalidWithdrawalException exception = new InvalidWithdrawalException(errorMessage);
        assertEquals(errorMessage, exception.getMessage(), "Exception message should match the provided message");
    }
}
