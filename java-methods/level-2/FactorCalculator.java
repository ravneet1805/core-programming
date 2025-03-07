// 1. Find factors of a number, store them in an array, and display the factors along with their sum, product, and sum of squares.

import java.util.Scanner;

public class FactorCalculator {
    
    
    // Returns an array of factors of the given number.
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    
    // Returns the sum of the elements in the array.
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
    
    // Returns the product of the elements in the array.
    public static long productOfArray(int[] arr) {
        long product = 1;
        for (int val : arr) {
            product *= val;
        }
        return product;
    }
    
    // Returns the sum of squares of the elements in the array.
    public static int sumOfSquares(int[] arr) {
        int sumSquares = 0;
        for (int val : arr) {
            sumSquares += (int) Math.pow(val, 2);
        }
        return sumSquares;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumOfArray(factors));
        System.out.println("Product of factors: " + productOfArray(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
