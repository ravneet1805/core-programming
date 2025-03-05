// 5. Rewrite the program 5 FizzBuzz using while loop 

import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}
