// 10. Create a program to take a number as input, find the frequency of each digit in the number using an array, and display the frequency of each digit.
import java.util.Scanner;

public class DigitFrequencyCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        
        // Count digits to determine array size.
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        // If number is 0, we treat it as one digit.
        if (number == 0) {
            count = 1;
        }
        
        // Store digits in an array.
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        
        // Frequency array for digits 0-9.
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }
        
        // Display frequency of each digit (only if frequency > 0).
        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }
    }
}
