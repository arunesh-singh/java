class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public synchronized void incrementSynchronized() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Pract8 {
    public static void main(String[] args) throws InterruptedException {
        // Without synchronization - race condition
        System.out.println("--- Without Synchronization ---");
        Counter c1 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 2000, Actual: " + c1.getCount());

        // With synchronization - fixed
        System.out.println("\n--- With Synchronization ---");
        Counter c2 = new Counter();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c2.incrementSynchronized();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c2.incrementSynchronized();
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("Expected: 2000, Actual: " + c2.getCount());
    }
}
