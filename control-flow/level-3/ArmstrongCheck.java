// 5.Program to check if a number is an Armstrong number.
// An Armstrong number is a number whose sum of the cubes of its digits equals the original number.
// For example, 153 = 1^3 + 5^3 + 3^3.
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10; // get the last digit
            sum += digit * digit * digit;    // add the cube of the digit to sum
            originalNumber /= 10;            // remove the last digit
        }

        if (sum == number)
            System.out.println(number + " is an Armstrong Number.");
        else
            System.out.println(number + " is not an Armstrong Number.");
    }
}
