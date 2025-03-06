// 3.Program to input marks in 3 subjects: Physics, Chemistry, and Maths, compute the percentage and average, and then calculate the grade and remarks.
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input marks for each subject
        System.out.print("Enter marks for Physics: ");
        double physics = in.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = in.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = in.nextDouble();
        
        // Calculate total marks, percentage and average
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        double average = totalMarks / 3;
        // Determine grade and remarks based on percentage
        String grade;
        String remarks;
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70 && percentage <= 79 ) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60 && percentage <= 69) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50 && percentage <= 59) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40 && percentage <= 49) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remidial standards";
        }
        
        // Output the average mark, percentage, grade, and remarks
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
