//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the unit price: ");
        double unitPrice = in.nextDouble();
        
        System.out.print("Enter the quantity: ");
        int quantity = in.nextInt();
        
        double totalPrice = unitPrice * quantity;
        
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
