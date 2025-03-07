// 12.Write a program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {
    // Calculates sine, cosine, and tangent values for the provided angle in degrees.
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);
        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);
        return new double[]{sine, cosine, tangent};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = in.nextDouble();
        
        double[] trigValues = calculateTrigonometricFunctions(angleDegrees);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
        

    }
}
