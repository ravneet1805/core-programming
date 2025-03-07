// 5. NumberCheckerPart4: Check if a number is prime, neon, spy, automorphic, and buzz.
import java.util.Scanner;

public class NumberCheckerPart4 {
    // Check if a number is prime.
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    
    // Check if a number is neon (sum of digits of square equals the number).
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumDigits = 0;
        while (square > 0) {
            sumDigits += square % 10;
            square /= 10;
        }
        return sumDigits == number;
    }
    
    // Check if a number is spy (sum of its digits equals the product of its digits).
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }
    
    // Check if a number is automorphic (its square ends with the number).
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String sNumber = Integer.toString(number);
        String sSquare = Integer.toString(square);
        return sSquare.endsWith(sNumber);
    }
    
    // Check if a number is a buzz number (divisible by 7 or ends with 7).
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println("Is prime: " + isPrime(number));
        System.out.println("Is neon: " + isNeon(number));
        System.out.println("Is spy: " + isSpy(number));
        System.out.println("Is automorphic: " + isAutomorphic(number));
        System.out.println("Is buzz: " + isBuzz(number));
    }
}
