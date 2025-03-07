// 11. EmployeeBonusCalculator: Calculate bonus for 10 employees based on years of service and display old/new salaries and bonus.
import java.util.Scanner;

public class EmployeeBonusCalculator {
    // Generate a random 5-digit salary.
    public static int getRandomSalary() {
        return 10000 + (int)(Math.random() * 90000);
    }
    
    // Generate random years of service between 1 and 30.
    public static int getRandomYears() {
        return 1 + (int)(Math.random() * 30);
    }
    
    // Calculate new salary and bonus: 5% bonus if years > 5; otherwise, 2%.
    public static double[] calculateNewSalaryAndBonus(int salary, int years) {
        double bonusRate = (years > 5) ? 0.05 : 0.02;
        double bonus = salary * bonusRate;
        double newSalary = salary + bonus;
        return new double[]{newSalary, bonus};
    }
    
    public static void main(String[] args) {
        int employees = 10;
        int[] oldSalaries = new int[employees];
        int[] yearsOfService = new int[employees];
        double[][] newSalaryBonus = new double[employees][2];
        
        for (int i = 0; i < employees; i++) {
            oldSalaries[i] = getRandomSalary();
            yearsOfService[i] = getRandomYears();
            newSalaryBonus[i] = calculateNewSalaryAndBonus(oldSalaries[i], yearsOfService[i]);
        }
        
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < employees; i++) {
            totalOld += oldSalaries[i];
            totalNew += newSalaryBonus[i][0];
            totalBonus += newSalaryBonus[i][1];
            System.out.println((i+1) + "\t" + oldSalaries[i] + "\t\t" + yearsOfService[i] + "\t" +
                               String.format("%.2f", newSalaryBonus[i][1]) + "\t" + String.format("%.2f", newSalaryBonus[i][0]));
        }
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus: " + totalBonus);
    }
}
