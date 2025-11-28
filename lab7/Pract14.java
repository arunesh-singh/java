import java.util.concurrent.Semaphore;

class ConnectionPool {
    private Semaphore semaphore = new Semaphore(3);

    public void useConnection(String threadName) {
        try {
            System.out.println(threadName + " waiting for connection...");
            semaphore.acquire();

            System.out.println(threadName + " acquired connection");
            System.out.println("Available connections: " + semaphore.availablePermits());

            Thread.sleep((long)(Math.random() * 2000));

            System.out.println(threadName + " releasing connection");
            semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Pract14 {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();

        for (int i = 1; i <= 5; i++) {
            String threadName = "Thread-" + i;
            new Thread(() -> pool.useConnection(threadName)).start();
        }
    }
}
