package generic;
public class genericmethod {
 public static <T> void display(T item) {
     System.out.println(item);
 }

 public static void main(String[] args) {
     display("Hello");
     display(123);
     display(45.67);
 }
}
