// 7.Write a program to find the sum of n natural numbers using loop

import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Calculates the sum of the first n natural numbers.
    public static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sum = calculateSumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is " + sum);
        }
        

    }
}
