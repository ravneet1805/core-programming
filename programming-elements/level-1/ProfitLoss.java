//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 


public class ProfitLoss {
    public static void main(String[] args) {
        int cp = 200;
        int sp = 250;

        int profit = sp-cp;
        double profitPercent = ((double)profit/cp) * 100;

        System.out.println("The Cost Price is INR "+cp+ " and Selling Price is "+ sp+
        " The Profit is INR "+profit+ " and the Profit Percentage is "+profitPercent+"%");
    }
}

