// 1.Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;

public class SimpleInterestCalculator {
    // Calculates the simple interest.
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double principal = in.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = in.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = in.nextDouble();
        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
        

    }
}
