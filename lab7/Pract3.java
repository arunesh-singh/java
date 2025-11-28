public class Pract3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread running...");
                Thread.sleep(2000);
                System.out.println("Thread awake after sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("State: " + t.getState()); // NEW

        t.start();
        System.out.println("State: " + t.getState()); // RUNNABLE

        Thread.sleep(500);
        System.out.println("State: " + t.getState()); // TIMED_WAITING

        t.join();
        System.out.println("State: " + t.getState()); // TERMINATED
    }
}
