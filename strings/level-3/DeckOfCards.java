// 10. DeckOfCards: Create a deck of cards, shuffle, distribute to players, and display players' cards.
import java.util.Scanner;

public class DeckOfCards {
    // Define suits and ranks.
    public static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                                    "Jack", "Queen", "King", "Ace"};
    
    // Initialize the deck of cards.
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    // Shuffle the deck using the Fisher–Yates algorithm.
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int)(Math.random() * (n - i));
            // Swap deck[i] and deck[randomIndex]
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    
    // Distribute the deck of cards to a given number of players.
    // Returns a 2D array: rows represent players, columns represent their cards.
    public static String[][] distributeCards(String[] deck, int players) {
        int cardsPerPlayer = deck.length / players;
        String[][] distribution = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distribution[i][j] = deck[index++];
            }
        }
        return distribution;
    }
    
    // Display the cards for each player.
    public static void displayDistribution(String[][] distribution) {
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Player " + (i+1) + " cards:");
            for (String card : distribution[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int players = in.nextInt();
        // Check if deck can be equally distributed.
        if (deck.length % players != 0) {
            System.out.println("The deck cannot be evenly distributed among " + players + " players.");
            return;
        }
        String[][] distribution = distributeCards(deck, players);
        displayDistribution(distribution);
    }
}
