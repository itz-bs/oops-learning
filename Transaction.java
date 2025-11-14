package lab;

public class Transaction {
    public void log(String action, double amount) {
        System.out.println("Transaction Amount Rs." + amount + " Action: " + action);
    }
}
