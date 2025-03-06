// 1. Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        int[] yearsOfService = new int[EMP_COUNT];
        double[] bonusAmount = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        
        // Input salary and years of service for each employee with validation.
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("  Enter salary (must be > 0): ");
            salary[i] = in.nextDouble();
            System.out.print("  Enter years of service (must be > 0): ");
            yearsOfService[i] = in.nextInt();
            // Validate input; if invalid, decrement index to re-enter data.
            if (salary[i] <= 0 || yearsOfService[i] <= 0) {
                System.out.println("  Invalid entry. Please re-enter details for this employee.");
                i--;  // decrement index so that this employee's data is re-entered.
                continue;
            }
        }
        
        // Calculate bonus and new salary for each employee.
        for (int i = 0; i < EMP_COUNT; i++) {
            totalOldSalary += salary[i];
            // Bonus: 5% if years > 5, otherwise 2%
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nBonus Payout and Salary Update for all Employees:");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                               ", Bonus = " + bonusAmount[i] +
                               ", New Salary = " + newSalary[i]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
