 // 3. Check if a year (>=1582) is a Leap Year (divisible by 4 and not by 100, or divisible by 400).

import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Gregorian calendar starts from 1582.
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            System.out.println(year + (isLeapYear(year) ? " is a Leap Year." : " is not a Leap Year."));
        }
    }
}
