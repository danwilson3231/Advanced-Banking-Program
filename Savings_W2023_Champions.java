/**
 * The Savings_W2023_Champions class represents a savings account that extends the Account_W2023_Champions class.
 * It includes an interest rate field and a method to add interest to the account balance.
 */
public class Savings_W2023_Champions extends Account_W2023_Champions {
    private double interestRate;

    /**
     * Constructs a Savings_W2023_Champions object with the specified account number, balance, date created, owner name, and interest rate.
     * @param accountNumber the account number associated with the savings account
     * @param balance the balance of the savings account
     * @param dateCreated the date when the savings account was created
     * @param ownerName the name of the owner of the savings account
     * @param interestRate the interest rate associated with the savings account
     */
    public Savings_W2023_Champions(String accountNumber, double balance, String dateCreated, String ownerName, double interestRate) {
        super(accountNumber, balance, dateCreated, ownerName);
        this.interestRate = interestRate;
        //System.out.println("you savings account has been created with account number:"+ accountNumber);
    }

    /**
     * Adds interest to the balance of the savings account.
     * @throws MalformedBalanceException if the balance of the account is negative or NaN
     */
    public void addInterest() throws MalformedBalanceException {
        try {
            balance *= (1 + interestRate);
        } catch (Exception e) {
            throw new MalformedBalanceException(e.toString());
        }
    }

    /**
     * Returns the interest rate associated with the savings account.
     * @return the interest rate associated with the savings account
     */
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) throws MalformedBalanceException, DailyLimitException {

    }
}
