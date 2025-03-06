// 10. Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position i = result.
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = in.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        String[] results = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i != 0 && i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i != 0 && i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
