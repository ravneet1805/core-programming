import java.util.Scanner;

// 10. Program to create a calculator using switch...case.

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of calculations you want to perform: ");
        int numCalculations = in.nextInt();
        
        for (int i = 1; i <= numCalculations; i++) {
            System.out.println("Calculation " + i + ":");
            System.out.print("Enter first number: ");
            double first = in.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            String op = in.next();
            System.out.print("Enter second number: ");
            double second = in.nextDouble();
            
            double result;
            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
        }
    }
}
