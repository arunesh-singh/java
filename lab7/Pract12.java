class InfiniteCounter extends Thread {
    public void run() {
        int count = 0;
        try {
            while (true) {
                System.out.println("Count: " + count++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted at count: " + count);
            System.out.println("Cleaning up resources...");
        }
        System.out.println("Thread terminated gracefully");
    }
}

public class Pract12 {
    public static void main(String[] args) throws InterruptedException {
        InfiniteCounter counter = new InfiniteCounter();
        counter.start();

        System.out.println("Main: Waiting 3 seconds before interrupt");
        Thread.sleep(3000);

        System.out.println("Main: Interrupting counter thread");
        counter.interrupt();

        counter.join();
        System.out.println("Main: Program completed");
    }
}
