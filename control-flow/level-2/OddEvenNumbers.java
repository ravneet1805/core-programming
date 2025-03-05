// 1.Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number < 1) {
            System.out.println("Enter a natural number greater than 0.");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
