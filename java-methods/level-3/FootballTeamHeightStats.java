// 1. FootballTeamHeightStats: Find the shortest, tallest, and mean height of players in a football team.
import java.util.Scanner;

public class FootballTeamHeightStats {
    // Generate a random height in cms (range: 150 to 250)
    public static int getRandomHeight() {
        return 150 + (int)(Math.random() * 101);
    }
    
    // Compute the sum of all heights in the array
    public static int computeSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    
    // Compute the mean height
    public static double computeMean(int[] heights) {
        return computeSum(heights) / (double) heights.length;
    }
    
    // Find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }
    
    // Find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = getRandomHeight();
        }
        System.out.print("Heights (in cms): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println("Sum of heights: " + computeSum(heights));
        System.out.println("Mean height: " + computeMean(heights));
        System.out.println("Shortest height: " + findShortest(heights));
        System.out.println("Tallest height: " + findTallest(heights));
    }
}
