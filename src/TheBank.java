import java.util.ArrayList;
import java.util.Scanner;

public class TheBank {

    // Private fields = data hiding
    private final ArrayList<BankAccount> accounts = new ArrayList<>();
    private final String name;

    // Constructor
    public TheBank(String name) {
        this.name = name;
    }

    // === METHODS === //
    // Method to get bank name
    public String getBankName() {
        return name;
    }

    // Method to view all Accounts
    public void viewAccounts() {
        for (BankAccount a : accounts) {
            System.out.println(a.getOwnerName());
            a.showBalance();
        }
    }

    // Method to change bank account
    public BankAccount changeAccount(Scanner scanner) {
        while(true) {
            System.out.println("Select 1 of the following Accounts: ");
            for (BankAccount a : accounts) {
                System.out.println(a.getOwnerName());
            }

            String selection = scanner.next();

            for (BankAccount a : accounts) {
                if (selection.equals(a.getOwnerName())) {
                    System.out.println("Changed to " + a + "'s account.");
                    return a;
                }
            }
            // Only prints if owner's name not found.
            System.out.println("Account doesn't exist, try again.");
        }
    }

    // Method to add new bank account
    public BankAccount addNewAccount(Scanner scanner) {
        System.out.println("\nName of account owner: ");
        String owner = scanner.next();

        System.out.println("\nStarting balance of " + owner + "'s account: ");
        float startingBalance = scanner.nextFloat();

        BankAccount account = new BankAccount(owner, startingBalance);
        accounts.add(account);

        return account;
    }
}