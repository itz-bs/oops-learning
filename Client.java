package lab;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 2710;
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            socket = new Socket(serverAddress, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from client!");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverReply = in.readLine();
            System.out.println("Server replies: " + serverReply);
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (socket != null) socket.close();
                System.out.println("Connection closed.");
            } catch (IOException closeEx) {
                System.out.println("Error closing resources: " + closeEx.getMessage());
            }
        }System.out.println("BHAVANI SANKAR M");
        System.out.println("2117240040015");
    }
}