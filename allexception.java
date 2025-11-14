package exception;

public class allexception {

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } finally {
            System.out.println("Code runs.");
        }

    }

    public static void checkNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must not be negative.");
        }
        System.out.println("Valid number: " + number);
    }
}