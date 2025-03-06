// 8. Write a program to find the factors of a number taken as user input, store the factors in an array, and display the factors.
import java.util.Scanner;
import java.util.Arrays;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = in.nextInt();
        
        int capacity = 10;
        int[] factors = new int[capacity];
        int index = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    capacity *= 2;
                    factors = Arrays.copyOf(factors, capacity);
                }
                factors[index] = i;
                index++;
            }
        }
        
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
