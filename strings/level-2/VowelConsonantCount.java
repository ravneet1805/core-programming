// 5. Find vowels and consonants in a string and display the count
import java.util.Scanner;

public class VowelConsonantCount {
    // Determine whether a character is a Vowel, Consonant, or Not a Letter.
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    
    // Count vowels and consonants in the string.
    // Returns an int array where index 0 is vowel count and index 1 is consonant count.
    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            String type = charType(s.charAt(i));
            if (type.equals("Vowel"))
                vowels++;
            else if (type.equals("Consonant"))
                consonants++;
        }
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        int[] counts = countVowelsConsonants(input);
        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);
    }
}
