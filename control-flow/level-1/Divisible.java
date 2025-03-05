// 1. Check if a number is divisible by 5
import java.util.Scanner;
class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        in.close();
    }
}










