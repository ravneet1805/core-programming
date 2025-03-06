// 11. Program DayOfWeek that takes a date as input from command-line arguments
// Output: 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        // Prompt the user for month, day, and year
        System.out.print("Enter month (1-12): ");
        int m = in.nextInt();
        System.out.print("Enter day: ");
        int d = in.nextInt();
        System.out.print("Enter year: ");
        int y = in.nextInt();
        
        // Apply the given formulas
        int y0 = y - ((14 - m) / 12);
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        
        // Print the day of the week
        System.out.println("Day: "+ d0);
    }
}
