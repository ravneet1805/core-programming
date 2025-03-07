// 7. Demonstrate NumberFormatException using Integer.parseInt() and handle it using try-catch
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String s) {
        // This will throw NumberFormatException if s is not a valid integer
        System.out.println(Integer.parseInt(s));
    }
    
    // Method to handle NumberFormatException using try-catch
    public static void handleNumberFormatException(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string representing an integer: ");
        String input = in.next();
        
        // Uncomment to see exception without handling:
        // generateNumberFormatException(input);
        
        // Now handle exception:
        handleNumberFormatException(input);
    }
}
