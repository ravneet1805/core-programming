// 5. Check voting eligibility
import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can vote." : "cannot vote."));

    }
}
