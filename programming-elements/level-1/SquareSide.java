//Write a program to find the side of the square whose parameter you read from user 


import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = in.nextDouble();
        
        double side = perimeter / 4;
        
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
