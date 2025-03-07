// 9. CalendarDisplay: Display a calendar for a given month and year.
import java.util.Scanner;

public class CalendarDisplay {
    // Array of month names.
    public static String[] monthNames = {"January", "February", "March", "April", "May", "June",
                                           "July", "August", "September", "October", "November", "December"};
    // Array of days in month for non-leap year.
    public static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    // Check if a year is a leap year.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    // Get first day of the month using Gregorian calendar algorithm.
    // Returns 0 for Sunday, 1 for Monday, ..., 6 for Saturday.
    public static int getFirstDayOfMonth(int month, int year) {
        // month: 1-12
        int m = month;
        int y = year;
        int d = 1; // first day of the month
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    
    // Display the calendar for the given month and year.
    public static void displayCalendar(int month, int year) {
        String monthName = monthNames[month-1];
        int days = daysInMonth[month-1];
        if (month == 2 && isLeapYear(year)) {
            days = 29;
        }
        int firstDay = getFirstDayOfMonth(month, year);
        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Indentation for the first day.
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();
        System.out.print("Enter year: ");
        int year = in.nextInt();
        displayCalendar(month, year);
    }
}
