import java.util.concurrent.CountDownLatch;

class Runner extends Thread {
    private String name;
    private CountDownLatch latch;

    public Runner(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println(name + " is getting ready...");
            Thread.sleep((long)(Math.random() * 2000));
            System.out.println(name + " is ready!");
            latch.countDown();

            latch.await();

            System.out.println(name + " started running!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Pract13 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);

        Runner r1 = new Runner("Runner-1", latch);
        Runner r2 = new Runner("Runner-2", latch);
        Runner r3 = new Runner("Runner-3", latch);
        Runner r4 = new Runner("Runner-4", latch);

        System.out.println("Race is about to start...");

        r1.start();
        r2.start();
        r3.start();
        r4.start();

        latch.await();
        System.out.println("\nAll runners are ready! GO!");
    }
}
