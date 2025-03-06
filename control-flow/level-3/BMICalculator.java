// 7. Program to calculate the BMI of a person and determine weight status.

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input weight in kilograms and height in centimeters
        System.out.print("Enter weight (in kg): ");
        double weight = in.nextDouble();
        
        System.out.print("Enter height (in cm): ");
        double heightCm = in.nextDouble();
        
        // Convert height from centimeters to meters
        double heightM = heightCm / 100;
        

        double bmi = weight / (heightM * heightM);
        

        System.out.printf("Your BMI is: %.2f\n", bmi);
        

        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
