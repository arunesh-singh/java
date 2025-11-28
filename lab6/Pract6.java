import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pract6 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {

            System.out.println("Copying file...");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Resources automatically closed");
    }
}
