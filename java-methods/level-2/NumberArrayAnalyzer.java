 // 9. For 5 numbers, check if each is positive or negative; if positive, determine if it is even or odd.
    // Then compare the first and last numbers: return 1 if first > last, 0 if equal, -1 if first < last.
    
import java.util.Scanner;

public class NumberArrayAnalyzer {

    
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compareNumbers(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }
        
        for (int num : numbers) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else {
                System.out.println(num + " is negative or zero.");
            }
        }
        
        int comparison = compareNumbers(numbers[0], numbers[4]);
        if (comparison > 0) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparison < 0) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first and last elements are equal.");
        }
    }
}
