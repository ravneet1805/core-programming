// 8. Determine the youngest friend and the tallest friend among Amar, Akbar, and Anthony.

import java.util.Scanner;

public class FriendsComparison {
    
    
    public static int findIndexOfMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int findIndexOfMax(double[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = in.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = in.nextDouble();
        }
        
        int youngestIndex = findIndexOfMin(ages);
        int tallestIndex = findIndexOfMax(heights);
        
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
    }
}
