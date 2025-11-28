import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class CounterWithLock {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void incrementWithTryLock(String threadName) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    System.out.println(threadName + " acquired lock");
                    count++;
                    Thread.sleep(500);
                } finally {
                    System.out.println(threadName + " releasing lock");
                    lock.unlock();
                }
            } else {
                System.out.println(threadName + " could not acquire lock (timeout)");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}

public class Pract15 {
    public static void main(String[] args) throws InterruptedException {
        CounterWithLock counter = new CounterWithLock();

        // Basic ReentrantLock
        System.out.println("=== Basic ReentrantLock ===");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());

        // TryLock with timeout
        System.out.println("\n=== TryLock with Timeout ===");
        Thread t3 = new Thread(() -> counter.incrementWithTryLock("Thread-3"));
        Thread t4 = new Thread(() -> counter.incrementWithTryLock("Thread-4"));

        t3.start();
        t4.start();
    }
}
