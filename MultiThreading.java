package jdbc;

class MultithreadingProgram extends Thread {
    public void run() {
        try {
        	System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingProgram t = new MultithreadingProgram();
            t.start();
        }
    }
}
