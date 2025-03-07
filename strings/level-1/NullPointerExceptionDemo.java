// 4. Demonstrate NullPointerException and its handling using try-catch
import java.util.Scanner;

public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }
    
    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Uncomment the following line to see the exception without handling:
        // generateNullPointerException();
        
        // Now call the method that handles the exception
        handleNullPointerException();
    }
}
