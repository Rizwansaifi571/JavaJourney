import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account object
        BankAccount account = new BankAccount();

        // Input account details
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter Account Type (e.g., Savings, Current): ");
        String accountType = scanner.nextLine();
        System.out.print("Enter Initial Account Balance: ");
        double initialBalance = scanner.nextDouble();

        // Set account details
        account.setAccountDetails(accountNumber, accountHolderName, accountType, initialBalance);

        int choice;
        do {
            // Display menu
            System.out.println("\nBank Account Management System");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.displayAccountDetails();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank Account Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    
}
// Data members
private String accountNumber;
private String accountHolderName;
private String accountType;
private double accountBalance;

// Method to set account details
public void setAccountDetails(String accountNumber, String accountHolderName, String accountType, double accountBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountType = accountType;
    this.accountBalance = accountBalance;
}

// Method to deposit amount
public void deposit(double amount) {
    if (amount > 0) {
        accountBalance += amount;
        System.out.println("Amount deposited: " + amount);
    } else {
        System.out.println("Invalid deposit amount.");
    }
}

// Method to withdraw amount
public void withdraw(double amount) {
    if (amount > 0 && amount <= accountBalance) {
        accountBalance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    } else if (amount > accountBalance) {
        System.out.println("Insufficient balance.");
    } else {
        System.out.println("Invalid withdrawal amount.");
    }
}

// Method to check account balance
public void checkBalance() {
    System.out.println("Account Balance: " + accountBalance);
}

// Method to display account details
public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Account Type: " + accountType);
    System.out.println("Account Balance: " + accountBalance);
}
}




