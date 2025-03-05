
// 6. Check if a number is positive, negative, or zero
import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        if (number > 0) System.out.println("Positive");
        else if (number < 0) System.out.println("Negative");
        else System.out.println("Zero");
        in.close();
    }
}
