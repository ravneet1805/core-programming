 // 11. Find the roots of the quadratic equation ax² + bx + c = 0.

import java.util.Scanner;

public class QuadraticEquationSolver {
    
    public static double[] solveQuadratic(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0]; // No real roots.
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = in.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = in.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = in.nextDouble();
        
        double[] roots = solveQuadratic(a, b, c);
        if (roots.length == 2) {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
