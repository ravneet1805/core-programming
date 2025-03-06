// 5. Create a program to take a number as input and reverse the number. Store the digits in an array and display the array in reverse order.
import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int numberInput = in.nextInt();
        int number = numberInput;
        
        // First, count digits (or use dynamic array extraction).
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extract digits and store them.
        while (number != 0) {
            if (index == maxDigit) {
                // Increase array size if needed.
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = number % 10;
            index++;
            number = number / 10;
        }
        
        // Create an array for the reversed order.
        int[] reversed = new int[index];
        for (int i = 0; i < index; i++) {
            reversed[i] = digits[index - 1 - i];
        }
        
        System.out.print("The digits of " + numberInput + " in reverse order are: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
}
