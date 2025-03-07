// 8. Take ages of 10 students and check voting eligibility (age>=18)
import java.util.Scanner;

public class StudentVotingEligibility {
    // Generate an array of random 2-digit ages for n students.
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10; // Random age between 10 and 99
        }
        return ages;
    }
    
    // Check each age and return a 2D String array with [age, "Can Vote"/"Cannot Vote"]
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }
    
    // Display the 2D array in a tabular format.
    public static void displayEligibility(String[][] data) {
        System.out.println("Age\tEligibility");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int[] ages = generateRandomAges(n);
        String[][] eligibility = checkVotingEligibility(ages);
        displayEligibility(eligibility);
    }
}
