public class Pract5 {

    static void methodC() {
        System.out.println("methodC: Performing division by zero");
        int result = 10 / 0;
    }

    static void methodB() {
        System.out.println("methodB: Calling methodC");
        methodC();
    }

    static void methodA() {
        try {
            System.out.println("methodA: Calling methodB");
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("methodA: Caught exception - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        methodA();
        System.out.println("Program continues after exception handling");
    }
}
