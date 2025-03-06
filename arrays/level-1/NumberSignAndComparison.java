// 2. Write a program to take user input for 5 numbers and check whether a number is positive, negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less.
import java.util.Scanner;

public class NumberSignAndComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        
        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        
        // Compare the first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }
}
