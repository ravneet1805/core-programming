// 1. An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. 
// For this create a program to find the BMI and display the height, weight, BMI and status of each individual.
import java.util.Scanner;

public class TeamBMICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Take input for number of persons
        System.out.print("Enter the number of persons in the team: ");
        int n = in.nextInt();
        
        // Create arrays to store weight, height, BMI and weight status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] status = new String[n];
        
        // Take input for the weight (in kg) and height (in cm) of each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("  Weight (in kg): ");
            weights[i] = in.nextDouble();
            System.out.print("  Height (in cm): ");
            heights[i] = in.nextDouble();
        }
        
        // Calculate the BMI and determine the weight status for each person
        for (int i = 0; i < n; i++) {
            // Convert height from cm to m
            double heightMeters = heights[i] / 100.0;
            // Calculate BMI = weight (kg) / (height (m))^2
            bmis[i] = weights[i] / (heightMeters * heightMeters);
            
            // Determine weight status based on BMI
            if (bmis[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmis[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Display the height, weight, BMI and weight status of each person
        System.out.println("\nTeam BMI Report:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), weights[i], heights[i], bmis[i], status[i]);
        }
    }
}
