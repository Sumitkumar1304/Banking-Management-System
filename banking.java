import java.util.Scanner;

public class banking {

    String name;
    int accountNumber;
    double balance;

    // Constructor to initialize the account
    public banking(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

    // Main method to run the program
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a new account
        banking account = new banking("sumit and isha", 1234567890, 900099.0);

        // Display account information
        System.out.println("Welcome " + account.name);
        System.out.println("Account Number: " + account.accountNumber);
        account.checkBalance();

        // Perform banking operations
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    account.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    account.checkBalance();
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
