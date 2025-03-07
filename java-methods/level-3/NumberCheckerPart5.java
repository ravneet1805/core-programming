// 6. NumberCheckerPart5: Find factors, then compute greatest factor (excluding the number), sum, product, product of cubes, and check perfect, abundant, deficient, and strong.
import java.util.Scanner;

public class NumberCheckerPart5 {
    // Find all factors of the number.
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
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
    
    // Find the greatest factor excluding the number itself.
    public static int findGreatestFactor(int number, int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f != number && f > greatest)
                greatest = f;
        }
        return greatest;
    }
    
    // Sum of all factors.
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    
    // Product of all factors.
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    
    // Product of cubes of all factors.
    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
    
    // Check if the number is perfect (sum of proper divisors equals the number).
    public static boolean isPerfect(int number, int[] factors) {
        int sumProper = sumOfFactors(factors) - number;
        return sumProper == number;
    }
    
    // Check if the number is abundant (sum of proper divisors > number).
    public static boolean isAbundant(int number, int[] factors) {
        int sumProper = sumOfFactors(factors) - number;
        return sumProper > number;
    }
    
    // Check if the number is deficient (sum of proper divisors < number).
    public static boolean isDeficient(int number, int[] factors) {
        int sumProper = sumOfFactors(factors) - number;
        return sumProper < number;
    }
    
    // Check if the number is strong (sum of factorials of digits equals the number).
    public static boolean isStrong(int number) {
        int sumFactorials = 0;
        int temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sumFactorials += factorial(d);
            temp /= 10;
        }
        return sumFactorials == number;
    }
    
    // Helper method to compute factorial.
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int[] factors = findFactors(number);
        
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("Greatest factor (excluding the number): " + findGreatestFactor(number, factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfect(number, factors));
        System.out.println("Is Abundant Number: " + isAbundant(number, factors));
        System.out.println("Is Deficient Number: " + isDeficient(number, factors));
        System.out.println("Is Strong Number: " + isStrong(number));
    }
}
