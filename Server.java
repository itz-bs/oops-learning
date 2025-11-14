package lab;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 2710;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Multi-threaded server running on port " + port + "...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println("Client says: " + msg);
            out.println("Reply from server: " + msg.toUpperCase());
            socket.close();
        } catch (IOException e) {
            System.out.println("Client handler error: " + e.getMessage());
        }
    }
}
