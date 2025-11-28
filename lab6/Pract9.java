import java.io.FileInputStream;
import java.io.FileNotFoundException;

class DataProcessingException extends Exception {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Pract9 {
    public static void main(String[] args) {

        try {
            processData("nonexistent.txt");

        } catch (DataProcessingException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
            System.out.println("Cause message: " + e.getCause().getMessage());
        }
    }

    static void processData(String filename) throws DataProcessingException {
        try {
            FileInputStream fis = new FileInputStream(filename);

        } catch (FileNotFoundException e) {
            throw new DataProcessingException("Failed to process data", e);
        }
    }
}
