package jdbc;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class client2 {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            MyService service = (MyService) registry.lookup("MyService");
            String reply = service.sayHello("User");
            System.out.println(reply);
            System.out.println("BHAVANI SANKAR M");
            System.out.println("2117240040015");
        } catch (Exception e) {
     
        	System.out.println(e);
        }
    }
}
