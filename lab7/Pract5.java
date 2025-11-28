class UserThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("User Thread: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("User Thread finished");
    }
}

class DaemonThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Daemon Thread: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Daemon Thread finished (won't print)");
    }
}

public class Pract5 {
    public static void main(String[] args) {
        UserThread user = new UserThread();
        DaemonThread daemon = new DaemonThread();

        daemon.setDaemon(true);

        user.start();
        daemon.start();

        System.out.println("Main thread exits when user thread finishes");
    }
}
