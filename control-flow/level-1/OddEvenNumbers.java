// 12. Find odd and even numbers up to n
import java.util.Scanner;
class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
        in.close();
    }
}