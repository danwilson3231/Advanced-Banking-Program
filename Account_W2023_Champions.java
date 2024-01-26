import java.time.LocalDate;

public abstract class Account_W2023_Champions {

    protected double balance;
    protected String dateCreated;
    protected String ownerName;
    protected String accountNumber;

    public Account_W2023_Champions(String accountNumber, double balance, String dateCreated, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = dateCreated;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) throws MalformedBalanceException {
        if (amount < 0) {
            throw new MalformedBalanceException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Success! your new balance after deposit is "+balance);
    }

    public abstract void withdraw(double amount) throws MalformedBalanceException, DailyLimitException;

    @Override
    public String toString() {
        return "Account_W2023_Champions{" +
                "balance=" + balance +
                ", dateCreated='" + dateCreated + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
