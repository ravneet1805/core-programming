// 3. Split text into words and return a 2D array with each word and its length
import java.util.Scanner;
import java.util.ArrayList;

public class WordLength2DArray {
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
    
    // Custom method to split text into words using charAt()
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
    
    // Create a 2D String array where each row contains [word, word_length_as_string]
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = in.nextLine();
        String[] words = customSplit(text);
        String[][] wordData = wordsWithLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordData.length; i++) {
            // Convert the length from String to int when displaying.
            System.out.println(wordData[i][0] + "\t" + Integer.parseInt(wordData[i][1]));
        }
    }
}
