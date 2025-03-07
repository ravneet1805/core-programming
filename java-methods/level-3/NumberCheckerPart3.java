// 4. NumberCheckerPart3: Reverse digits, compare arrays, and check for palindrome and duck number.
import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerPart3 {
    // Count digits in the number.
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }
    
    // Store digits in an array.
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
    // Reverse the digits array.
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }
    
    // Compare two arrays for equality.
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    
    // Check if a number is a palindrome.
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    
    // Check if a number is a duck number.
    public static boolean isDuckNumber(int number) {
        String s = Integer.toString(number);
        return s.indexOf('0') > 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println("Is palindrome: " + isPalindrome(number));
        System.out.println("Is duck number: " + isDuckNumber(number));
    }
}
