// 2. UniqueCharacters: Find unique characters in a string using charAt() (without built-in length()).
import java.util.Scanner;

public class UniqueCharacters {
    // Custom method to compute string length without using length()
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) { }
        return count;
    }
    
    // Returns an array of unique characters from the string.
    public static char[] getUniqueCharacters(String s) {
        int len = customLength(s);
        char[] temp = new char[len]; // maximum possible unique characters
        int uniqueCount = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = ch;
            }
        }
        // Copy unique characters to array of proper size.
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = in.next();
        char[] unique = getUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
