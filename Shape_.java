package lab;
class shape {
  void area() {
    System.out.println("Default area");
  }
}

class circle extends shape {
  void area (double r) {
    System.out.println("Area of circle = " + 3.14 * r * r);
  }
}

class rectangle extends shape {
  void area (double l, double b) {
    System.out.println("Area of rectangle = " + l * b);
  }
}

public class Shape_ {
  public static void main(String[] args) {
    shape S = new shape();
    circle C = new circle();
    rectangle R = new rectangle();
    System.out.println("TC1: circle with radius 5 -> output= 78.5");
    C.area(5);
    System.out.println("");
    System.out.println("TC2: rectangle 10x5 -> output= 50");
    R.area(10, 5);
    System.out.println("");
    System.out.println("TC3: shape area () not overriden -> no output");
    S.area();
    System.out.println("");
    System.out.println("TC4: circle with radius 0 -> output= 0");
    C.area(0);
    System.out.println("");
    System.out.println("TC5: rectangle 0 -> output= 0");
    R.area(0,0);
    System.out.println(" ");
    System.out.println("Bhavani Sankar M");
    System.out.println("2117240040015");
  }
}