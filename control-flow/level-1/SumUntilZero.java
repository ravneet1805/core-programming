// 10. Sum numbers until user enters 0
import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number: ");
            double num = in.nextDouble();
            if (num == 0) break;
            total += num;
        }
        System.out.println("Total sum: " + total);

    }
}