package exception;
import java.util.Scanner;
public class exception{
public static void main(String[]args) {	
	
try {
    int a[]= {22,27,12};
    System.out.println("Value of c: " + a[9]);
} catch (Exception e) {
    System.out.println("Error: " + e);
} finally {
    System.out.println("Code executed");
}}
}


