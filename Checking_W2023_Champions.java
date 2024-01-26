/**

 * The Checking_W2023_Champions class represents a checking account that extends the Account_W2023_Champions class.
 * It includes an overdraft limit and a withdraw method with overdraft protection.
 */
public class Checking_W2023_Champions extends Account_W2023_Champions {

    /**

     The overdraft limit of the checking account.
     */
    private double overdraftLimit;
    /**

     Constructs a new Checking_W2023_Champions object with the specified account number, balance, date created, owner name, and overdraft limit.
     @param accountNumber the account number of the checking account
     @param balance the balance of the checking account
     @param dateCreated the date the checking account was created
     @param ownerName the name of the owner of the checking account
     @param overdraftLimit the overdraft limit of the checking account
     */
    public Checking_W2023_Champions(String accountNumber, double balance, String dateCreated, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, dateCreated, ownerName);
        this.overdraftLimit = overdraftLimit;
//System.out.println("you checking account has been created with account number:"+ accountNumber);
    }
    /**
     * Withdraws the specified amount from the checking account with overdraft protection.
     *
     * @param amount the amount to be withdrawn from the checking account
     * @throws DailyLimitException if the withdrawal amount exceeds the balance and overdraft limit of the checking account
     */
    public void withdraw(double amount) throws DailyLimitException {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Success! your new balance after withdraw is "+balance);
        } else {
            throw new DailyLimitException("Insufficient funds.");
        }
    }
    /**

     Returns the overdraft limit of the checking account.
     @return the overdraft limit of the checking account
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}