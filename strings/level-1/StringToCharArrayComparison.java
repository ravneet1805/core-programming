// 3. Return all characters in a string using a custom method and compare with toCharArray()
import java.util.Scanner;

public class StringToCharArrayComparison {
    // Return the characters of a string without using toCharArray()
    public static char[] customToCharArray(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }
    
    // Compare two char arrays for equality
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next();
        
        char[] customArray = customToCharArray(input);
        char[] builtInArray = input.toCharArray();
        
        System.out.print("Custom toCharArray result: ");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        System.out.print("Built-in toCharArray result: ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        boolean arraysEqual = compareCharArrays(customArray, builtInArray);
        System.out.println("Both char arrays are " + (arraysEqual ? "equal." : "not equal."));
    }
}
