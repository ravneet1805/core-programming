// 3. Check which number is the largest of the three
import java.util.Scanner;
class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt(), num2 = in.nextInt(), num3 = in.nextInt();
        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2));
        in.close();
    }
}