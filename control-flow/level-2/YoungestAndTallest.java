// 6. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Amar's age and height: ");
        int age1 = in.nextInt();
        int height1 = in.nextInt();
        
        System.out.print("Enter Akbar's age and height: ");
        int age2 = in.nextInt();
        int height2 = in.nextInt();
        
        System.out.print("Enter Anthony's age and height: ");
        int age3 = in.nextInt();
        int height3 = in.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);
    }
}
