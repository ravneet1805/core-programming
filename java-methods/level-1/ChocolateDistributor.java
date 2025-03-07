// 10.Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates


import java.util.Scanner;

public class ChocolateDistributor {
    // Distributes chocolates and returns an array: [chocolates per child, remaining chocolates].
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = in.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = in.nextInt();
        
        if (numberOfChildren <= 0) {
            System.out.println("Number of children should be greater than 0.");
        } else {
            int[] distribution = distributeChocolates(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets " + distribution[0] + " chocolates, and remaining chocolates: " + distribution[1]);
        }
        
    }
}
