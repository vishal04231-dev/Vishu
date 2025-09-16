import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        acc.createAccount();
        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());
        acc.displayBalance();
    }
}
