//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.


import java.util.Scanner;
public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double unitPrice = in.nextDouble();
        
        int quantity = in.nextInt();
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}
