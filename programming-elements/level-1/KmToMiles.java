//Create a program to convert distance in kilometers to miles.

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the distance in kilometers: ");
        double km = in.nextDouble();
        
        double miles = km / 1.6;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
