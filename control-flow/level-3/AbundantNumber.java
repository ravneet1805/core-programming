// 9.Program to check if a number is an Abundant Number.
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int sum = 0;
        
        // Calculate the sum of all proper divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
