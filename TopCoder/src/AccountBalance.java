/**
 * 171.28
 */
public class AccountBalance {
    public int processTransactions(int startingBalance, String[] transactions) {
        int endingBalance = startingBalance;

        for (String transaction : transactions) {
            String operation = transaction.substring(0, 1);
            String amountString = transaction.substring(2);
            int amount = Integer.parseInt(amountString);

            if (operation.equalsIgnoreCase("C")) {
                endingBalance += amount;
            } else {
                endingBalance -= amount;
            }
        }
        return endingBalance;
    }
}
