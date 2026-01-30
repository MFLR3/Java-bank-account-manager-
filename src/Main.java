import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {

                // Initialize bank
                TheBank bank = new TheBank("Piggy Bank");

                // To start, add this first account to accounts and assign to local variable
                BankAccount account = bank.addNewAccount(scanner);

                System.out.println(bank.getBankName());

                // Current account
                BankAccount currentAccount = account;

                // Simple menu
                while (true) {
                    System.out.println("\n1. Deposit  2. Withdraw  3. Show Balance  4. Change Account 5. Create Account 6. Show All Accounts 7. Show current account 8. Show interest 9. Exit");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        currentAccount.deposit(amount);
                    } else if (choice == 2) {
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        currentAccount.withdraw(amount);
                    } else if (choice == 3) {
                        currentAccount.showBalance();
                    } else if (choice == 4) {
                        currentAccount = bank.changeAccount(scanner);
                    } else if (choice == 5) {
                        bank.addNewAccount(scanner);
                    } else if (choice == 6) {
                        bank.viewAccounts();
                    } else if (choice == 7) {
                        System.out.println("Current account owner: " + currentAccount.getOwnerName()); // Bookmark
                    } else if (choice == 8) {
                        currentAccount.showAccountInterest();
                    } else if (choice == 9) {
                        break;
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
            }
        }
    }
