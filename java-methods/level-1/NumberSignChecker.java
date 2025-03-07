// 5.Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class NumberSignChecker {
    // Returns 1 if positive, -1 if negative, and 0 if zero.
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        
        int sign = checkNumberSign(number);
        if (sign > 0) {
            System.out.println("The number is positive.");
        } else if (sign < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        

    }
}
