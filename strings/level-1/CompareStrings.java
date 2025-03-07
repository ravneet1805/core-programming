// 1. Compare two strings using the charAt() method and check with built-in equals()
import java.util.Scanner;

public class CompareStrings {
    // Compare two strings character-by-character using charAt()
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
        System.out.print("Enter first string: ");
        String firstString = in.next();
        System.out.print("Enter second string: ");
        String secondString = in.next();
        
        boolean customResult = compareStringsCharByChar(firstString, secondString);
        boolean builtInResult = firstString.equals(secondString);
        
        System.out.println("Custom charAt() comparison: " + customResult);
        System.out.println("Built-in equals() comparison: " + builtInResult);
        System.out.println("Both comparisons are " + (customResult == builtInResult ? "the same." : "different."));
    }
}
