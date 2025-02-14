//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount


import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the fee: ");
        double fee = in.nextDouble();
        
        System.out.print("Enter the discount percent: ");
        double discountPercent = in.nextDouble();
        
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
