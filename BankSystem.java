import java.util.*;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int num, String holder, double bal) {
        accountNumber = num;
        accountHolder = holder;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int num, String holder, double bal, double rate) {
        super(num, holder, bal);
        interestRate = rate;
    }

    void showDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder); // protected accessible
        System.out.println("Balance: " + getBalance()); // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder:");
        String holder = sc.nextLine();
        System.out.println("Enter Balance:");
        double bal = sc.nextDouble();
        System.out.println("Enter Interest Rate:");
        double rate = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(num, holder, bal, rate);
        sa.deposit(1000);
        sa.withdraw(500);
        sa.showDetails();
    }
}
