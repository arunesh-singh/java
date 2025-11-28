import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pract4 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            System.out.println("Trying to open file...");
            fis = new FileInputStream("test.txt");
            System.out.println("File opened successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());

        } finally {
            System.out.println("Finally block executing...");
            try {
                if (fis != null) {
                    fis.close();
                    System.out.println("File closed");
                }
            } catch (Exception e) {
                System.out.println("Error closing file");
            }
        }
    }
}
