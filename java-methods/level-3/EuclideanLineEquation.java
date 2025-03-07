// 9. EuclideanLineEquation: Compute the Euclidean distance between two points and determine the line equation.
import java.util.Scanner;

public class EuclideanLineEquation {
    // Calculate Euclidean distance between two points.
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Return an array [slope, yIntercept] for the line through two points.
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) { // Vertical line
            return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        }
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();
        
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        double[] lineEq = findLineEquation(x1, y1, x2, y2);
        
        System.out.println("Euclidean Distance: " + distance);
        if (lineEq[0] == Double.POSITIVE_INFINITY) {
            System.out.println("The line is vertical.");
        } else {
            System.out.println("Line Equation: y = " + lineEq[0] + "x + " + lineEq[1]);
        }
    }
}
