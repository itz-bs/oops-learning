package network;
import java.io.*;
import java.net.*;
public class myserver {
    public static void main(String[]args) {
    	try {
    		ServerSocket ss=new ServerSocket(2212);
    		Socket a = ss.accept();
    		DataInputStream i = new DataInputStream(a.getInputStream());
    		String str=(String)i.readUTF();
    		System.out.println("Message: "+str);
    		ss.close();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
