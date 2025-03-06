// 2. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights.
import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int FRIEND_COUNT = 3;
        int[] ages = new int[FRIEND_COUNT];
        int[] heights = new int[FRIEND_COUNT];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Input ages and heights for the three friends.
        for (int i = 0; i < FRIEND_COUNT; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = in.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = in.nextInt();
        }
        
        // Find the youngest and tallest friend.
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < FRIEND_COUNT; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        System.out.println("\nYoungest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
    }
}
