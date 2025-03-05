// 9. Create a program to find the power of a number.


import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = in.nextInt();
        System.out.print("Enter the power: ");
        int power = in.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
