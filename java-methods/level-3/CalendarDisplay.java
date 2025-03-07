// 8. CalendarDisplay: Display a calendar for a given month and year.
import java.util.Scanner;

public class CalendarDisplay {
    // Return the month name for a given month number.
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    
    // Return the number of days in a month for a given year.
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
    
    // Check for leap year.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    // Get the first day of the month using Zeller's Congruence.
    // Returns 0=Sunday, 1=Monday, ..., 6=Saturday.
    public static int getFirstDayOfMonth(int month, int year) {
        int q = 1;
        int m = (month < 3) ? month + 12 : month;
        int K = year % 100;
        int J = year / 100;
        if (month < 3) {
            year--;
        }
        int h = (q + (13*(m+1))/5 + K + (K/4) + (J/4) + (5*J)) % 7;
        int d = ((h + 6) % 7);
        return d;
    }
    
    // Display the calendar for the specified month and year.
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
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
