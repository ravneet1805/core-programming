//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double height = in.nextDouble();
        
        double areaInInches = 0.5 * base * height;
        double areaInCentimeters = areaInInches * 6.4516;

        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + areaInInches + " square inches and " + areaInCentimeters + " square centimeters");

    }
}
