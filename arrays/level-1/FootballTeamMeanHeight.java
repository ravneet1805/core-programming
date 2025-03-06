// 6. Write a program to find the mean height of players present in a football team.
import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = in.nextDouble();
            sum += heights[i];
        }
        
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team: " + mean + " cm");
    }
}
