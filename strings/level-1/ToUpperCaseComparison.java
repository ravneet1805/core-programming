// 9. Convert text to uppercase using a custom method (via charAt()) and compare with built-in toUpperCase()
import java.util.Scanner;

public class ToUpperCaseComparison {
    // Custom method to convert a string to uppercase using charAt()
    public static String customToUpperCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    
    // Compare two strings character-by-character
    public static boolean compareStringsCharByChar(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complete text: ");
        String text = in.nextLine();
        
        String customUpper = customToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        
        System.out.println("Custom uppercase conversion: " + customUpper);
        System.out.println("Built-in toUpperCase() result: " + builtInUpper);
        
        boolean areEqual = compareStringsCharByChar(customUpper, builtInUpper);
        System.out.println("Both methods yield " + (areEqual ? "equal" : "different") + " results.");
    }
}
