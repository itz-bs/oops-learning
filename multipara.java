package generic;
class Box2<T, U> {
 private T first;
 private U second;

 public void set(T first, U second) {
     this.first = first;
     this.second = second;
 }

 public T getFirst() {
     return first;
 }

 public U getSecond() {
     return second;
 }
}

public class multipara {
 public static void main(String[] args) {
     Box2<Integer, String> b1 = new Box2<>();
     b1.set(123, "display");
     System.out.println(b1.getFirst());
     System.out.println(b1.getSecond());
 }
}