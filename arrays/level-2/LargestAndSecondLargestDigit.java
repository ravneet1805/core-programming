// 3. Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberInput = in.nextInt();
        int number = numberInput;  // Preserve original value if needed.
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extract digits and store in the array (fixed size of 10).
        while (number != 0 && index < maxDigit) {
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
