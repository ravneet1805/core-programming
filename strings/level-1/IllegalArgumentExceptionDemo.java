// 6. Demonstrate IllegalArgumentException using substring() with start > end and handle it using try-catch
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String s) {
        // This will throw IllegalArgumentException because start index is greater than end index
        System.out.println(s.substring(5, 2));
    }
    
    // Method to handle IllegalArgumentException using try-catch
    public static void handleIllegalArgumentException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        
        // Uncomment to see exception without handling:
        // generateIllegalArgumentException(input);
        
        // Now handle exception:
        handleIllegalArgumentException(input);
    }
}
