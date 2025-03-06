// 4.A prime number is greater than 1 and divisible only by 1 and itself.
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to the number-1 to check for divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number.");
        else
            System.out.println(number + " is not a Prime Number.");
    }
}
