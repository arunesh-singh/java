class Printer {
    // Synchronized method - locks entire method
    public synchronized void printMethod(String doc) {
        System.out.println("Method: Printing " + doc);
        for (int i = 1; i <= 3; i++) {
            System.out.println(doc + " - Page " + i);
        }
        System.out.println("Method: Completed " + doc);
    }

    // Synchronized block - locks only critical section
    public void printBlock(String doc) {
        System.out.println("Block: Starting " + doc);

        synchronized(this) {
            System.out.println("Block: Printing " + doc);
            for (int i = 1; i <= 3; i++) {
                System.out.println(doc + " - Page " + i);
            }
            System.out.println("Block: Completed " + doc);
        }

        System.out.println("Block: Post-processing " + doc);
    }
}

public class Pract9 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("=== Synchronized Method ===");
        Thread t1 = new Thread(() -> printer.printMethod("Doc1"));
        Thread t2 = new Thread(() -> printer.printMethod("Doc2"));
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== Synchronized Block ===");
        Thread t3 = new Thread(() -> printer.printBlock("Doc3"));
        Thread t4 = new Thread(() -> printer.printBlock("Doc4"));
        t3.start();
        t4.start();
    }
}
