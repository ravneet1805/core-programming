 // 10. For 10 persons, calculate BMI using weight (kg) and height (cm) and display BMI along with status.

import java.util.Scanner;

public class BMICalculator {

    
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal weight";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int persons = 10;
        double[][] data = new double[persons][3]; // Column 0: weight, Column 1: height, Column 2: BMI
        
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = in.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = in.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }
        
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < persons; i++) {
            String status = getBMIStatus(data[i][2]);
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", (i + 1), data[i][0], data[i][1], data[i][2], status);
        }
    }
}
