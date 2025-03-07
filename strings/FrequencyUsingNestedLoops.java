// 6. FrequencyUsingNestedLoops: Find frequency of characters in a string using nested loops.
import java.util.Scanner;

public class FrequencyUsingNestedLoops {
    public static void frequencyNested(String s) {
        char[] chArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chArr[i] = s.charAt(i);
        }
        int[] freq = new int[s.length()];
        // Initialize all frequencies to 1.
        for (int i = 0; i < s.length(); i++) {
            freq[i] = 1;
        }
        // Nested loops to count duplicates.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (chArr[i] == chArr[j]) {
                    freq[i]++;
                    // Mark duplicate so not counted again.
                    chArr[j] = '0';
                }
            }
        }
        System.out.println("Character\tFrequency");
        for (int i = 0; i < s.length(); i++) {
            if (chArr[i] != '0') {
                System.out.println(chArr[i] + "\t\t" + freq[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        frequencyNested(input);
    }
}
