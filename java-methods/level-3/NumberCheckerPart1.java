// 2. NumberCheckerPart1: Count digits, store digits, check duck & Armstrong numbers, and find largest/second largest and smallest/second smallest digits.
import java.util.Scanner;

public class NumberCheckerPart1 {
    // Count the number of digits in the number.
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }
    
    // Store the digits of the number in an array.
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
    // Check if a number is a duck number (contains a '0' not in the first position).
    public static boolean isDuckNumber(int number) {
        String s = Integer.toString(number);
        return s.indexOf('0') > 0;
    }
    
    // Check if a number is an Armstrong number.
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int count = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, count);
        }
        return sum == number;
    }
    
    // Find the largest and second largest digits in the array.
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }
    
    // Find the smallest and second smallest digits in the array.
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        System.out.println("Digit count: " + countDigits(number));
        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));
        
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second Largest digit: " + largestTwo[1]);
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second Smallest digit: " + smallestTwo[1]);
    }
}
