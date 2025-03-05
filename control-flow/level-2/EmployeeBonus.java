// 2.Create a program to find the bonus of employees based on their years of service.

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = in.nextDouble();
        System.out.print("Enter years of service: ");
        int years = in.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }
    }
}
