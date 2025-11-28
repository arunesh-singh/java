import java.util.Scanner;

public class Pract8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            try {
                int num = Integer.parseInt(input);
                System.out.println("Number parsed: " + num);

                int result = 100 / num;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

        } catch (NumberFormatException e) {
            System.out.println("Outer catch: Invalid number format");
        } finally {
            sc.close();
        }

        System.out.println("Program completed");
    }
}
