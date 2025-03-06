// 4. Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers.
import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter positive numbers (enter 0 or a negative number to stop):");
        while (true) {
            double input = in.nextDouble();
            if (input <= 0 || index >= 10) {
                break;
            }
            values[index] = input;
            index++;
        }
        
        System.out.println("You entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }
        System.out.println("\nTotal sum: " + total);
    }
}
