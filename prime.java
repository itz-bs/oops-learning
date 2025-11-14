package lab;
import java.util.Scanner;
public class prime {


	    public static void main(String[] args) {
	    	try {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        if (n <= 1) {
	            System.out.println(n + " is not a prime number.");
	            return;
	        }

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                System.out.println(n + " is not a prime number.");
	                return;
	            }
	        }

	        System.out.println(n + " is a prime number.");
	    	}
	        finally {
	        	System.out.println("BHAVANI SANKAR M");
		        System.out.println(" 2117240040015");
	        }

	        
	    }
	    
	    
	}



