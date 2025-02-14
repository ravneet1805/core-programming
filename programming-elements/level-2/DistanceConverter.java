//Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double feet = in.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
