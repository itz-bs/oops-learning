package lab;

public class sum {
    public static void main(String[] args) {
        int s = 0,u=0,v=0,x=0,y=0;
        for (int i = 1; i <= 100; i++) {
            s += i;
        }
        System.out.println("TC 1:Sum from 1 to 100 --> Expected: 5050 ");
        System.out.println("Sum of all numbers from 1 to 100 is : "+s);
        System.out.println(" ");
        for (int i = 1; i <= 50; i++) {
            u+= i;
        }
        System.out.println("TC 1:Sum from 1 to 50 --> Expected: 1275 ");
        System.out.println("Sum of all numbers from 1 to 50 is : "+u);
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            v += i;
        }
        System.out.println("TC 1:Sum from 1 to 10 --> Expected: 55 ");
        System.out.println("Sum of all numbers from 1 to 10 is : "+v);
        System.out.println(" ");
        for (int i = 50; i <= 100; i++) {
            x += i;
        }
        System.out.println("TC 1:Sum from 50 to 100 --> Expected: 3825 ");
        System.out.println("Sum of all numbers from 50 to 100 is : "+x);
        System.out.println(" ");
        for (int i = 1; i <= 1; i++) {
            y += i;
        }
        System.out.println("TC 1:Sum from 1 to 1 --> Expected: 1 ");
        System.out.println("Sum of all numbers from 1 to 1 is : "+y);
        System.out.println(" ");
        System.out.println("BHAVANI SANKAR M");
        System.out.println("2117240040015");
    }

}
