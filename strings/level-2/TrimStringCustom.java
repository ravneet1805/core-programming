// 7. Trim leading and trailing spaces using charAt(), custom substring and compare with built-in trim()
import java.util.Scanner;

public class TrimStringCustom {
    // Find the start and end indexes of the non-space characters.
    public static int[] findTrimIndices(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ')
            start++;
        while (end >= 0 && s.charAt(end) == ' ')
            end--;
        return new int[]{start, end};
    }
    
    // Create a substring using charAt() from start to end (inclusive)
    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    
    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
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
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = in.nextLine();
        int[] indices = findTrimIndices(input);
        String customTrimmed = "";
        if (indices[0] <= indices[1])
            customTrimmed = customSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();
        System.out.println("Custom trimmed string: [" + customTrimmed + "]");
        System.out.println("Built-in trim() result: [" + builtInTrimmed + "]");
        boolean same = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("Both methods yield " + (same ? "equal" : "different") + " results.");
    }
}
