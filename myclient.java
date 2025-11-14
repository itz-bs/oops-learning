package network;
import java.io.*;
import java.net.*;
public class myclient {
	public static void main(String[]args) {
		try {
			Socket s=new Socket("localhost",2212);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello , this is the request from BS");
			dout.flush();
			dout.close();
			s.close();
			System.out.println("Message Sent to Bs PC");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}