// Approach 1: Extending Thread class
class CounterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread (extends): " + i);
        }
    }
}

// Approach 2: Implementing Runnable interface
class CounterRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable (implements): " + i);
        }
    }
}

public class Pract2 {
    public static void main(String[] args) {
        // Using Thread class
        CounterThread t1 = new CounterThread();
        t1.start();

        // Using Runnable interface
        CounterRunnable r = new CounterRunnable();
        Thread t2 = new Thread(r);
        t2.start();

        System.out.println("\nComparison:");
        System.out.println("Thread: Direct inheritance, single class extension");
        System.out.println("Runnable: Better design, allows multiple interface implementation");
    }
}
