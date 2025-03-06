// 7. Write a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array.
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = in.nextInt();
        
        if (number <= 0) {
            System.out.println("Error: Input must be a natural number (greater than 0).");
            return;
        }
        
        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];
        int oddIndex = 0, evenIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
