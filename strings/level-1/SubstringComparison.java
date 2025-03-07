// 2. Create a substring using charAt() and compare with built-in substring() method
import java.util.Scanner;

public class SubstringComparison {
    // Create a substring using charAt() from start index (inclusive) to end index (exclusive)
    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }
    
    // Compare two strings character-by-character
    public static boolean compareStringsCharByChar(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = in.next();
        System.out.print("Enter start index: ");
        int start = in.nextInt();
        System.out.print("Enter end index: ");
        int end = in.nextInt();
        
        String customSub = customSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        
        System.out.println("Custom substring: " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        boolean areEqual = compareStringsCharByChar(customSub, builtInSub);
        System.out.println("Both substrings are " + (areEqual ? "equal." : "not equal."));
    }
}
