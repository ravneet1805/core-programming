// 4. Split text into words and find the shortest and longest words
import java.util.Scanner;
import java.util.ArrayList;

public class ShortestLongestWords {
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
    
    // Create a 2D String array with each row: [word, word_length_as_string]
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }
    
    // Find the shortest and longest words from the 2D array.
    // Returns an array where index 0 is the shortest word and index 1 is the longest word.
    public static String[] findShortestAndLongest(String[][] wordData) {
        if (wordData.length == 0)
            return new String[]{"", ""};
        String shortest = wordData[0][0];
        String longest = wordData[0][0];
        for (int i = 1; i < wordData.length; i++) {
            int currentLen = customLength(wordData[i][0]);
            if (currentLen < customLength(shortest))
                shortest = wordData[i][0];
            if (currentLen > customLength(longest))
                longest = wordData[i][0];
        }
        return new String[]{shortest, longest};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = in.nextLine();
        String[] words = customSplit(text);
        String[][] wordData = wordsWithLengths(words);
        String[] result = findShortestAndLongest(wordData);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
