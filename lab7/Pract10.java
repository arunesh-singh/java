class Demo {
    // Instance synchronized method - locks object
    public synchronized void instanceMethod(String name) {
        System.out.println(name + " acquired instance lock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " released instance lock");
    }

    // Static synchronized method - locks class
    public static synchronized void staticMethod(String name) {
        System.out.println(name + " acquired class lock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " released class lock");
    }
}

public class Pract10 {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        // Instance synchronization - different objects, different locks
        System.out.println("=== Instance Synchronization ===");
        Thread t1 = new Thread(() -> obj1.instanceMethod("T1-Obj1"));
        Thread t2 = new Thread(() -> obj2.instanceMethod("T2-Obj2"));
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Static synchronization - same class lock for all
        System.out.println("\n=== Static Synchronization ===");
        Thread t3 = new Thread(() -> Demo.staticMethod("T3"));
        Thread t4 = new Thread(() -> Demo.staticMethod("T4"));
        t3.start();
        t4.start();
    }
}
