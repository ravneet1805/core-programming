// 5. FrequencyUsingUniqueCharacters: Find frequency of characters using unique characters from a string.
import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    // Reuse the custom length method from earlier.
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
    
    // Get unique characters from string.
    public static char[] getUniqueCharacters(String s) {
        int len = customLength(s);
        char[] temp = new char[len];
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
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    
    // Count frequency of each unique character.
    public static void frequencyUsingUnique(String s) {
        char[] unique = getUniqueCharacters(s);
        System.out.println("Character\tFrequency");
        for (char ch : unique) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch)
                    count++;
            }
            System.out.println(ch + "\t\t" + count);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        frequencyUsingUnique(input);
    }
}
