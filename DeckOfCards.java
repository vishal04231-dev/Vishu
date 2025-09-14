package methods.string;
import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String s : suits) for (String r : ranks) deck[index++] = r + " of " + s;
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int n) {
        if (players * n > deck.length) return null;
        String[][] hands = new String[players][n];
        int index = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < players; j++) hands[j][i] = deck[index++];
        return hands;
    }

    public static void displayHands(String[][] hands) {
        for (int i = 0; i < hands.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (String card : hands[i]) System.out.print(card + ", ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        int players = sc.nextInt();
        int n = sc.nextInt();
        String[][] hands = distribute(deck, players, n);
        displayHands(hands);
    }
}
