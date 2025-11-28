import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class Pract7 {

    static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters");
        }
        System.out.println("Password is valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            validatePassword(password);

        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
