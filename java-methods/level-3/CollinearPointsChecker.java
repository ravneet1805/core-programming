// 10. CollinearPointsChecker: Determine if three points are collinear using the area method.
import java.util.Scanner;

public class CollinearPointsChecker {
    // Check if three points are collinear (area of triangle is 0).
    public static boolean areCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return Math.abs(area) < 1e-6;
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
        System.out.print("Enter x3: ");
        double x3 = in.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = in.nextDouble();
        
        boolean collinear = areCollinear(x1, y1, x2, y2, x3, y3);
        System.out.println("The points are " + (collinear ? "collinear." : "not collinear."));
    }
}
