class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority());
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}

public class Pract4 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("MIN-Thread", Thread.MIN_PRIORITY);
        PriorityThread t2 = new PriorityThread("NORM-Thread", Thread.NORM_PRIORITY);
        PriorityThread t3 = new PriorityThread("MAX-Thread", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
