//Write a program the find the distance in yards and miles for the distance provided by user in feets


import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = in.nextDouble();
        
        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / 5280;
        
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");
    }
}
