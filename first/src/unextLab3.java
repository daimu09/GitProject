import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;

    // Constructor
    public BankAccount(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0; // Initial balance is set to zero
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new bank account
        BankAccount myAccount = new BankAccount(123456, "John Doe");

        // Interact with the account
        myAccount.deposit(1000);
        myAccount.withdraw(500);

        // Display account information
        myAccount.displayAccountInfo();

        scanner.close();
    }
}