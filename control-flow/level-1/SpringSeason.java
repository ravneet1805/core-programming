// 7. Check if it is a Spring season date
import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = in.nextInt(), day = in.nextInt();
        System.out.println((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6) ? "It's a Spring Season" : "Not a Spring Season");

    }
}
