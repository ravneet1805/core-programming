// 8. Create a program to take input marks of students in 3 subjects (Physics, Chemistry, Maths), compute the percentage and calculate the grade.
import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        
        // Input marks for each student (validating non-negative marks)
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("  Physics: ");
            double p = in.nextDouble();
            System.out.print("  Chemistry: ");
            double c = in.nextDouble();
            System.out.print("  Maths: ");
            double m = in.nextDouble();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("  Invalid marks entered. Please re-enter the marks for this student.");
                i--; // Re-enter for this student.
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
            
            double total = p + c + m;
            percentage[i] = (total / 300.0) * 100;
            
            // Determine grade (example grading scheme)
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        
        // Display marks, percentage, and grade of each student.
        System.out.println("\nStudent Marks Report:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%s\n", 
                (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
