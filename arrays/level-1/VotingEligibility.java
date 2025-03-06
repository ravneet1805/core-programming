// 1. Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age.
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ages = new int[10];
        
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
        }
        
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
