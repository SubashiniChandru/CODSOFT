import java.util.*;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
            return true;
        } else {
            System.out.println("Insufficient funds or Invalid withdrawal amount.");
            return false;
        }
    }
}
public class AtmInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.0); // Initialize with an initial balance of $1000

        while (true) {
            System.out.println("\nWelcome to the ATM Interface!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Rs." + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: Rs.");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to Withdraw: Rs.");
                    double withdrawalAmount = scanner.nextDouble();
                    boolean success = userAccount.withdraw(withdrawalAmount);
                    if (success) {
                        System.out.println("Remaining balance: Rs." + userAccount.getBalance());
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

