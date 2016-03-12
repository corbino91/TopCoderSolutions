import org.junit.*;

import static org.junit.Assert.assertTrue;

public class AccountBalanceTest {
    private static AccountBalance accountBalance = new AccountBalance();

    private static String[] transaction0 = {"C 1000", "D 500", "D 350"};
    private static String[] transaction1 = {};
    private static String[] transaction2 = {"D 50", "D 20", "D 40"};
    private static String[] transaction3 = {"D 1234", "C 987", "D 2345", "C 654", "D 6789", "D 34567"};

    @Test
    public void testCase0() {
        assertTrue("Ending balance should be $250", accountBalance.processTransactions(100, transaction0) == 250);
    }

    @Test
    public void testCase1() {
        assertTrue("Ending balance should be $100", accountBalance.processTransactions(100, transaction1) == 100);
    }

    @Test
    public void testCase2() {
        assertTrue("Ending balance should be -$10", accountBalance.processTransactions(100, transaction2) == -10);
    }

    @Test
    public void testCase3() {
        assertTrue("Ending balance should be $10580", accountBalance.processTransactions(53874, transaction3) == 10580);
    }
}
