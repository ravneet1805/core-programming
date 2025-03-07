// 3.Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;

public class MaximumHandshakesCalculator {
    // Calculates maximum handshakes among n students.
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        
        int maxHandshakes = calculateMaximumHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        

    }
}
