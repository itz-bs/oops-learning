package oops;
class Demo {
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }
}

public class finalize {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj=null;
        System.gc();
        System.out.println("End of main()");
    }
}

