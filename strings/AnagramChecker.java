// 8. AnagramChecker: Check if two texts are anagrams.
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    // Check if two strings are anagrams by comparing frequency arrays.
    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lower case.
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length())
            return false;
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int f : freq) {
            if (f != 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String firstText = in.nextLine();
        System.out.print("Enter second text: ");
        String secondText = in.nextLine();
        
        boolean anagram = areAnagrams(firstText, secondText);
        System.out.println("The texts are " + (anagram ? "anagrams." : "not anagrams."));
    }
}
