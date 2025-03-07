// 4.An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.Scanner;

public class TriangularParkRunner {
    // Calculates the number of rounds needed to complete a 5 km run.
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = in.nextDouble();
        
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = in.nextDouble();
        
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = in.nextDouble();
        
        int roundsNeeded = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + roundsNeeded + " rounds to complete a 5 km run.");
        

    }
}
