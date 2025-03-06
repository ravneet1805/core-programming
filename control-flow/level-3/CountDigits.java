// 6.Program to count the number of digits in an integer.
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int count = 0;
        int temp = number;
        
        // Special case: if the number is 0, it has 1 digit.
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10; // Remove the last digit in each iteration
            }
        }

        System.out.println("Number of digits in " + number + " is: " + count);
    }
}
