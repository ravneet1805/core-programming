//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }
}
