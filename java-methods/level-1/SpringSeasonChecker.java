// 6.Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 

import java.util.Scanner;

public class SpringSeasonChecker {
    // Returns true if the given date is in the Spring season.
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3) {
            return day >= 20;
        } else if (month == 4 || month == 5) {
            return true;
        } else if (month == 6) {
            return day <= 20;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter month (as an integer): ");
        int month = in.nextInt();
        
        System.out.print("Enter day: ");
        int day = in.nextInt();
        
        boolean isSpring = isSpringSeason(month, day);
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        

    }
}
