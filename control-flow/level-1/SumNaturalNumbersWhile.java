// 12. Find the sum of n natural numbers using while loop and compare with formula
import java.util.Scanner;

class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number");
        } else {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both computations match: " + (sum == formulaSum));
        }
        in.close();
    }
}