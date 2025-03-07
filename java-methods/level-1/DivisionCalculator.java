// 9.Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;

public class DivisionCalculator {
    // Calculates quotient and remainder.
    public static int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        int dividend = in.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = in.nextInt();
        
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] result = calculateQuotientAndRemainder(dividend, divisor);
            System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        }
        

    }
}
