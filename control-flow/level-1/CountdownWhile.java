// 8. Countdown using while loop
import java.util.Scanner;
class CountdownWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = in.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
        in.close();
    }
}