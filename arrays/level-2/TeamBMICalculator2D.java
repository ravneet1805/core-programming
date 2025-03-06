// 1. Rewrite the BMI program using a multi-dimensional array to store height, weight, and BMI for all persons.
import java.util.Scanner;

public class TeamBMICalculator2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of persons in the team: ");
        int n = in.nextInt();
        
        // personData[i][0] = weight (kg), personData[i][1] = height (cm), personData[i][2] = BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        // Input weight and height for each person (validate for positive values)
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("  Weight (in kg): ");
            double weight = in.nextDouble();
            if (weight <= 0) {
                System.out.println("  Invalid weight. Please enter a positive value.");
                i--; // Re-enter details for this person.
                continue;
            }
            System.out.print("  Height (in cm): ");
            double height = in.nextDouble();
            if (height <= 0) {
                System.out.println("  Invalid height. Please enter a positive value.");
                i--; // Re-enter details for this person.
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            // Calculate BMI: convert height from cm to m.
            double heightM = height / 100.0;
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
            
            // Determine weight status based on BMI.
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display the details.
        System.out.println("\nTeam BMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
