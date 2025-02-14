//Create a program to find the maximum number of handshakes among N number of students.


import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
