public class BankAccount {
    // Private fields = data hiding
    private final String owner;
    private double balance;
    private static final double interestRate = 0.2;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("£" + amount + " deposited. New balance: " + String.format("%.2f", balance));
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("£" + amount + " withdrawn. New balance: " + String.format("%.2f", balance));
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to show balance
    public void showBalance() {
        System.out.println(owner + "'s balance: £" + String.format("%.2f", balance));
    }

    // Method to get account owner name
    public String getOwnerName() {
        return owner;
    }

    // Method to display account interest
    public void showAccountInterest() {
        double interest = interestRate * balance;
        System.out.println(owner + "'s total interest is £" + String.format("%.2f", interest) + ". ");
        System.out.println(owner + "'s current balance + interest is £" + String.format("%.2f", (interest + balance)) + ". ");

    }
}
