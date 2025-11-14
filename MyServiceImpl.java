package jdbc;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MyServiceImpl extends UnicastRemoteObject implements MyService {
    public MyServiceImpl() throws RemoteException { }
    public String sayHello(String name) {
        return "✅ RMI Reply from Server: Hello " + name + ", connection successful!";
    }
}
