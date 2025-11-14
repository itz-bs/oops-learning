package lab;
class Racer extends Thread {
    private String name;
    private int steps;
    private long sleepMillis;

    public Racer(String name, int steps, long sleepMillis) {
        this.name = name;
        this.steps = steps;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= steps; i++) {
                System.out.printf("%s: Step %d/%d\n", name, i, steps);
                Thread.sleep(sleepMillis);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            return;
        }
        System.out.println(name + " has finished!");
    }
}
public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n=== TC1: Two threads start together ===");
        Racer r1 = new Racer("Runner-A", 5, 500);
        Racer r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r1.join();
        r2.join();

        System.out.println("\n=== TC2: Different sleep times (B faster) ===");
        r1 = new Racer("Runner-A", 5, 600);
        r2 = new Racer("Runner-B", 5, 400);
        r1.start();
        r2.start();
        r1.join();
        r2.join();

        System.out.println("\n=== TC3: Race between A and B (non-deterministic) ===");
        r1 = new Racer("Runner-A", 5, 450);
        r2 = new Racer("Runner-B", 5, 450);
        r1.start();
        r2.start();
        r1.join();
        r2.join();

        System.out.println("\n=== TC4: Three-thread race ===");
        Racer r3 = new Racer("Runner-C", 5, 500);
        r1 = new Racer("Runner-A", 5, 500);
        r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r3.start();
        r1.join();
        r2.join();
        r3.join();

        System.out.println("\n=== TC5: Same sleep times, interleaved output ===");
        r1 = new Racer("Runner-A", 5, 500);
        r2 = new Racer("Runner-B", 5, 500);
        r1.start();
        r2.start();
        r1.join();
        r2.join();
        System.out.println("BHAVANI SANKAR M");
        System.out.println("2117240040015");
    }
}