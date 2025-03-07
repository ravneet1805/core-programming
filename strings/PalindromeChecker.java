// 7. PalindromeChecker: Check if a text is a palindrome using iterative, recursive, and reverse methods.
import java.util.Scanner;

public class PalindromeChecker {
    // Iterative check
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    
    // Recursive check
    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if(start >= end)
            return true;
        if(s.charAt(start) != s.charAt(end))
            return false;
        return isPalindromeRecursive(s, start+1, end-1);
    }
    
    // Reverse method check (using charAt())
    public static boolean isPalindromeReverse(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.next();
        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length()-1);
        boolean result3 = isPalindromeReverse(text);
        
        System.out.println("Iterative method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Reverse method: " + (result3 ? "Palindrome" : "Not Palindrome"));
    }
}
