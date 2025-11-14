package lab;

public class BankingService {
    public static void main(String[] args) {
        Bank a = new Bank();
        Transaction t = new Transaction();

        System.out.println("TC1: Deposit 1000");
        a.deposit(1000);
        System.out.println(" ");
        System.out.println("TC2: Withdraw 500");
        a.withdraw(500);
        System.out.println(" ");
        System.out.println("TC3: Withdraw 1500");
        a.withdraw(1500);
        System.out.println(" ");
        System.out.println("TC4: Deposit -500");
        a.deposit(-500);
        System.out.println(" ");
        System.out.println("TC5: Log Transaction");
        t.log("Balance Summary", 1000);

        a.check_balance();
        System.out.println(" ");
        System.out.println("BHAVANI SANKAR M");
        System.out.println("2117240040015");
    }
}
