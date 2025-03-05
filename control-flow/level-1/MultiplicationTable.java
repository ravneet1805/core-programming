// 18. Multiplication table from 6 to 9 for entered number
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        in.close();
    }
}