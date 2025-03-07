// 1. Find and return the length of a string without using the length() method
import java.util.Scanner;

public class StringLengthWithoutLength {
    // Custom method: uses an infinite loop with charAt() until an exception is thrown.
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When charAt() goes out-of-bounds, we have reached the end.
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        int myLength = customLength(input);
        int builtInLength = input.length();
        System.out.println("Custom computed length: " + myLength);
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Both results are " + (myLength == builtInLength ? "equal." : "different."));
    }
}
