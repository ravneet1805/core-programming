// 12. ScoreCardGenerator: Generate random marks for students in 3 subjects, compute total, average, and percentage, and display the scorecard.
import java.util.Scanner;

public class ScoreCardGenerator {
    // Generate a random 2-digit score (range: 10 to 99).
    public static int getRandomScore() {
        return 10 + (int)(Math.random() * 90);
    }
    
    // Generate a 2D array of scores for given number of students in 3 subjects.
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = getRandomScore();
            }
        }
        return scores;
    }
    
    // Compute total, average, and percentage for each student.
    public static double[][] computeResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // total, average, percentage
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    
    // Display the scorecard.
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                               (int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = in.nextInt();
        int[][] scores = generateScores(numberOfStudents);
        double[][] results = computeResults(scores);
        displayScoreCard(scores, results);
    }
}
