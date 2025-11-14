package lab;

interface Banking {
    void deposit(double amount);
    void withdraw(double amount);
    void check_balance();
}

public class Bank implements Banking {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid amount");
        }
    }

    public void check_balance() {
        System.out.println("Balance Amount: Rs. " + balance);
    }
}
