package lab;
import java.util.Scanner;
public class exception {
	public static void divide(int a,int b) {
		try {
			int div= a/b;
			System.out.println("answer = "+div);
		}catch(Exception e) {
			System.out.println(e);
		}System.out.println("BHAVANI SANKAR M");
		System.out.println("2117240040015");
	}
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Numbers : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	sc.close();
	divide(a,b);
	}
}