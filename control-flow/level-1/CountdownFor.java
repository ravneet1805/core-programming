// 9. Countdown using for loop
import java.util.Scanner;
class CountdownFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = in.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
        in.close();
    }
}