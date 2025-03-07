// 5. Demonstrate StringIndexOutOfBoundsException and its handling using try-catch
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String s) {
        // Accessing the character at index equal to the length (out of bounds)
        System.out.println(s.charAt(s.length()));
    }
    
    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleStringIndexOutOfBoundsException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        
        // Uncomment to see exception without handling:
        // generateStringIndexOutOfBoundsException(input);
        
        // Now handle exception:
        handleStringIndexOutOfBoundsException(input);
    }
}
