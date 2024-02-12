package exceptions;

import org.junit.Test;
import exceptions.BankAccount;
import exceptions.InsufficientFundsException;
import exceptions.InvalidWithdrawalException;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testValidWithdrawal() {
        BankAccount account = new BankAccount(4000.0);
        try {
            account.withdraw(500.0);
            assertEquals(3500.0, account.getBalance(), 0.01); // Assert balance after withdrawal
        } catch (Exception e) {
            fail("Unexpected exception occurred: " + e.getMessage());
        }
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdrawalWithInsufficientFunds() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(4000.0);
        account.withdraw(5000.0); // Attempt to withdraw more than balance
    }

    @Test(expected = InvalidWithdrawalException.class)
    public void testInvalidWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(4000.0);
        account.withdraw(-200.0); // Attempt to withdraw negative amount
    }
}
