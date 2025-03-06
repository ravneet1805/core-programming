// 8.Program to check if a number is a Harshad Number.
// A Harshad number is an integer which is divisible by the sum of its digits.

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int original = number; // Preserve the original number
        int sum = 0;
        
        // Calculate the sum of digits of the number
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        
        // Check if the original number is divisible by the sum of its digits
        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is not a Harshad Number.");
        }
    }
}
