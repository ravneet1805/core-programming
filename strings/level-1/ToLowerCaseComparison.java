// 10. Convert text to lowercase using a custom method (via charAt()) and compare with built-in toLowerCase()
import java.util.Scanner;

public class ToLowerCaseComparison {
    // Custom method to convert a string to lowercase using charAt()
    public static String customToLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
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
        
        String customLower = customToLowerCase(text);
        String builtInLower = text.toLowerCase();
        
        System.out.println("Custom lowercase conversion: " + customLower);
        System.out.println("Built-in toLowerCase() result: " + builtInLower);
        
        boolean areEqual = compareStringsCharByChar(customLower, builtInLower);
        System.out.println("Both methods yield " + (areEqual ? "equal" : "different") + " results.");
    }
}
