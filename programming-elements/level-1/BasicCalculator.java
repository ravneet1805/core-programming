//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations


import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 +
        " and " + num2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
