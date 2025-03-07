 // 2. Calculate the sum of n natural numbers recursively and compare with the formula n*(n+1)/2.
 
import java.util.Scanner;

public class RecursiveSumCalculator {
    
    // Recursively computes the sum of the first n natural numbers.
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    
    // Computes the sum of the first n natural numbers using the formula.
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int sumRecursion = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Both computations match: " + (sumRecursion == sumFormula));
    }
}
