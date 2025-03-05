// 13. Find the sum of n natural numbers using for loop and compare with formula
import java.util.Scanner;

class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both computations match: " + (sum == formulaSum));
        }

    }
}