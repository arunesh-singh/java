import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class ClockThread extends Thread {
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (int i = 0; i < 10; i++) {
            System.out.println("Time: " + LocalTime.now().format(formatter));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Clock stopped");
    }
}

public class Pract6 {
    public static void main(String[] args) {
        ClockThread clock = new ClockThread();
        clock.start();
    }
}
