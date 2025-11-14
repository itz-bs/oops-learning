package jdbc;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            MyService service = new MyServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MyService", service);
            System.out.println("RMI Server is running on port 1099...");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
