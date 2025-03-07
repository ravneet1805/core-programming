// 9. Rock-Paper-Scissors game between user and computer; display game stats and win percentages.
import java.util.Scanner;

public class RockPaperScissorsGame {
    // Generate computer's choice randomly.
    public static String getComputerChoice() {
        double r = Math.random();
        if (r < 0.33)
            return "rock";
        else if (r < 0.66)
            return "paper";
        else
            return "scissors";
    }
    
    // Determine the winner based on user and computer choices.
    public static String determineWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice))
            return "Tie";
        if (userChoice.equals("rock")) {
            return compChoice.equals("scissors") ? "User" : "Computer";
        }
        if (userChoice.equals("paper")) {
            return compChoice.equals("rock") ? "User" : "Computer";
        }
        if (userChoice.equals("scissors")) {
            return compChoice.equals("paper") ? "User" : "Computer";
        }
        return "Invalid";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = in.nextInt();
        int userWins = 0, compWins = 0, ties = 0;
        
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 1; i <= games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = in.next().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = determineWinner(userChoice, compChoice);
            System.out.println(i + "\t" + userChoice + "\t" + compChoice + "\t\t" + winner);
            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;
            else if (winner.equals("Tie"))
                ties++;
        }
        double userWinPercent = (userWins * 100.0) / games;
        double compWinPercent = (compWins * 100.0) / games;
        System.out.println("\nSummary:");
        System.out.println("Total games: " + games);
        System.out.println("User wins: " + userWins + " (" + userWinPercent + "%)");
        System.out.println("Computer wins: " + compWins + " (" + compWinPercent + "%)");
        System.out.println("Ties: " + ties);
    }
}
