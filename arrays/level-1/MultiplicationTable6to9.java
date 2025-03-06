// 5. Write a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result.
import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for multiplication table (from 6 to 9): ");
        int number = in.nextInt();
        
        int[] results = new int[4];
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            results[index] = number * i;
            index++;
        }
        
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[index]);
            index++;
        }
    }
}
