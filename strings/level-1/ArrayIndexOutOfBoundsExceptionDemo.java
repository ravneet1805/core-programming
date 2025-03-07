// 8. Demonstrate ArrayIndexOutOfBoundsException by accessing an invalid array index and handle it using try-catch
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] arr) {
        // Accessing an index beyond the array's length
        System.out.println(arr[arr.length]);
    }
    
    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleArrayIndexOutOfBoundsException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        // Uncomment to see exception without handling:
        // generateArrayIndexOutOfBoundsException(names);
        
        // Now handle exception:
        handleArrayIndexOutOfBoundsException(names);
    }
}
