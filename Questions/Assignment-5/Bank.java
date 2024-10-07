class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance = 0.0;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance; // Initial balance is zero
    }

    // Method to deposit cash
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited cash: Rs. " + amount);
        } else {
            System.out.println("Invalid cash deposit amount.");
        }
    }

    // Overloaded method to deposit a check
    public void deposit(String checkNumber, double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited check " + checkNumber + ": Rs. " + amount);
        } else {
            System.out.println("Invalid check deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: Rs. " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        // Create a bank account instance
        BankAccount account = new BankAccount("123456789", "John Doe", 0.0);

        // Display initial account details
        account.displayAccountDetails();

        // Deposit cash and check
        account.deposit(1500.0);             // Cash deposit
        account.deposit("CHK123", 2500.0);   // Check deposit

        // Display balance after deposits
        System.out.println("Current Balance: Rs. " + account.getBalance());

        // Withdraw money
        account.withdraw(2000.0);

        // Display final account details
        account.displayAccountDetails();
    }
}
