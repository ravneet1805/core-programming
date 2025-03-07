// 3. NumberCheckerPart2: Compute sum of digits, sum of squares, check Harshad number, and find digit frequency.
import java.util.Scanner;

public class NumberCheckerPart2 {
    // Count digits in the number.
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }
    
    // Store digits of the number in an array.
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
    // Sum of digits.
    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    
    // Sum of squares of digits.
    public static int sumOfSquares(int number) {
        int[] digits = getDigits(number);
        int sumSq = 0;
        for (int d : digits) {
            sumSq += Math.pow(d, 2);
        }
        return sumSq;
    }
    
    // Check if the number is a Harshad number (divisible by the sum of its digits).
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return sum != 0 && number % sum == 0;
    }
    
    // Return a 2D array containing frequency of each digit (0-9).
    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        int[] digits = getDigits(number);
        for (int d : digits) {
            freq[d]++;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquares(number));
        System.out.println("Is Harshad number: " + isHarshad(number));
        
        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
        }
    }
}
