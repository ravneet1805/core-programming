// 11. Find the sum until the user enters 0 or a negative number using while loop and break statement
import java.util.Scanner;

class SumUntilNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number: ");
            double num = in.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total sum: " + total);
        in.close();
    }
}