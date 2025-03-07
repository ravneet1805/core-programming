// 2. Split text into words (without using split()) and compare with built-in split() method
import java.util.Scanner;
import java.util.ArrayList;

public class SplitTextComparison {
    // Custom method to compute string length without using length()
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) { }
        return count;
    }
    
    // Custom method to split the text into words using charAt()
    public static String[] customSplit(String text) {
        ArrayList<String> wordsList = new ArrayList<>();
        int len = customLength(text);
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    wordsList.add(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            wordsList.add(word);
        }
        String[] words = new String[wordsList.size()];
        for (int i = 0; i < wordsList.size(); i++) {
            words[i] = wordsList.get(i);
        }
        return words;
    }
    
    // Compare two string arrays for equality
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = in.nextLine();
        
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        
        System.out.print("Custom split result: ");
        for (String w : customWords) {
            System.out.print("[" + w + "] ");
        }
        System.out.println();
        System.out.print("Built-in split() result: ");
        for (String w : builtInWords) {
            System.out.print("[" + w + "] ");
        }
        System.out.println();
        boolean equal = compareStringArrays(customWords, builtInWords);
        System.out.println("Both methods yield " + (equal ? "equal" : "different") + " results.");
    }
}
