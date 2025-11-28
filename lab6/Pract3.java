import java.util.Scanner;
import java.util.InputMismatchException;

public class Pract3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Must be between 0 and 4");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
        } finally {
            sc.close();
        }
    }
}
