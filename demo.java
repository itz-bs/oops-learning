package generic;
class Calculator<T extends Number> {
 private T num;

 Calculator(T num) {
     this.num = num;
 }

 public double square() {
     return num.doubleValue() * num.doubleValue();
 }
}

public class demo {
 public static void main(String[] args) {
     Calculator<Integer> c = new Calculator<>(4);
     System.out.println(c.square());
 }
}
