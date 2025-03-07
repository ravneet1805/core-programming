// 10. Take marks in Physics, Chemistry, Maths; compute total, average, percentage, and grade; display scorecard.
import java.util.Scanner;

public class StudentScoreCard {
    // Generate random 2-digit scores for n students in 3 subjects.
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; // Random between 10 and 99
            }
        }
        return scores;
    }
    
    // Calculate total, average, and percentage for each student.
    // Returns a 2D array where each row contains [total, average, percentage].
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    
    // Determine grade based on percentage.
    public static String determineGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }
    
    // Display the scorecard in tabular format.
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            String grade = determineGrade(stats[i][2]);
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                               (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t\t" + grade);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateTotalsAndPercentages(scores);
        displayScoreCard(scores, stats);
    }
}
