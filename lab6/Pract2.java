import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Pract2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            } else if (age > 150) {
                throw new InvalidAgeException("Age cannot exceed 150");
            }

            System.out.println("Valid age: " + age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
