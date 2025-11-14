package lab;

import java.util.Scanner;
public class fibonacci {
    public static int fib(int n) {
    	if (n==0) return 0 ;
    	if (n==1) return 1 ;
    	return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Ente a number:");
    	int n=sc.nextInt();
    	sc.close();
    	
    	for(int i =0;i<n;i++) {
    		System.out.println(fib(i)+" ");
    	}
    	System.out.println("BHVANI SANKAR M");
        System.out.println("2117240040015");


}
}
