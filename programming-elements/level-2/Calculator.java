//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;

        double multiplication = num1 * num2;

        double division = 0;
        
        if (num2 != 0) {

            division = num1 / num2;
        }

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
        + num1 + " and " + num2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
    }
}
