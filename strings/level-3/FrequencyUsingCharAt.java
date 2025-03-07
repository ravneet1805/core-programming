// 4. FrequencyUsingCharAt: Find frequency of characters in a string using charAt() and display results.
import java.util.Scanner;

public class FrequencyUsingCharAt {
    public static void frequencyOfCharacters(String s) {
        int[] freq = new int[256];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)]++;
        }
        System.out.println("Character\tFrequency");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + "\t\t" + freq[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        frequencyOfCharacters(input);
    }
}
