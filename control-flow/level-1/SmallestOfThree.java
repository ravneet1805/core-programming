// 2. Check if the first number is the smallest of three
import java.util.Scanner;
class SmallestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt(), num2 = in.nextInt(), num3 = in.nextInt();
        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));
        in.close();
    }
}