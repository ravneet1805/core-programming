// 6. Find vowels and consonants in a string and display each character’s type in a 2D array
import java.util.Scanner;

public class VowelConsonantType2DArray {
    // Determine the type of a character.
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    
    // Return a 2D array where each row contains [character, type]
    public static String[][] getCharTypes(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = String.valueOf(s.charAt(i));
            result[i][1] = charType(s.charAt(i));
        }
        return result;
    }
    
    // Display the 2D array in tabular format
    public static void display2DArray(String[][] arr) {
        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        String[][] charData = getCharTypes(input);
        display2DArray(charData);
    }
}
