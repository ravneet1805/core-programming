// 1. BMICalculatorTeam: Compute BMI and status for a team of 10 persons.
// Takes user input for weight (kg) and height (cm) for 10 persons,
// computes BMI = weight / ( (height/100)^2 ) and determines status.
import java.util.Scanner;

public class BMICalculatorTeam {
    // Returns BMI status based on BMI value.
    public static String getBMIStatus(double bmi) {
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    
    // Given the 2D array of weight & height, compute a 2D String array: 
    // [weight, height, BMI, status] for each person.
    public static String[][] computeBMIResults(double[][] data) {
        int n = data.length;
        String[][] results = new String[n][4];
        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(heightCm);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getBMIStatus(bmi);
        }
        return results;
    }
    
    // Displays the results in a tabular format.
    public static void displayResults(String[][] results) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t\t" + row[3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] teamData = new double[10][2]; // 10 persons; col0: weight, col1: height.
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + " weight: ");
            teamData[i][0] = in.nextDouble();
            System.out.print("Person " + (i+1) + " height: ");
            teamData[i][1] = in.nextDouble();
        }
        String[][] bmiResults = computeBMIResults(teamData);
        displayResults(bmiResults);
    }
}
