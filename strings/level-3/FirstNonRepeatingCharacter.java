// 3. FirstNonRepeatingCharacter: Find the first non-repeating character in a string using charAt().
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    // Returns the first non-repeating character or a special char if none exists.
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256]; // ASCII size
        int len = s.length();
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < len; i++) {
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return '\0'; // Return null char if none found.
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        char result = firstNonRepeating(input);
        if(result != '\0')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
