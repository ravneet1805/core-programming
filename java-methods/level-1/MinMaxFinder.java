// 8.Write a program to find the smallest and the largest of the 3 numbers.


import java.util.Scanner;

public class MinMaxFinder {
    // Finds and returns the smallest and largest numbers among three inputs.
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        return new int[]{smallest, largest};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("The smallest number is " + result[0]);
        System.out.println("The largest number is " + result[1]);
        

    }
}
