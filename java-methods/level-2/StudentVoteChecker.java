 // 7. Take the age of 10 students and check whether each student can vote (age >= 18).

import java.util.Scanner;

public class StudentVoteChecker {
    
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " (age " + studentAges[i] + ") can vote: " + canStudentVote(studentAges[i]));
        }
    }
}
