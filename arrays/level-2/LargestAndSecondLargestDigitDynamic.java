// 4. Rework the program to store the digits of the number in an array and find the largest and second largest element, by increasing the array size dynamically if needed.
import java.util.Scanner;
import java.util.Arrays;

public class LargestAndSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberInput = in.nextInt();
        int number = numberInput;  // Preserve the original value.
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Dynamically store all digits.
        while (number != 0) {
            if (index == maxDigit) {
                // Increase array size by 10.
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
        
        // Find largest and second largest digit.
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        
        System.out.println("For the number " + numberInput + ":");
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
