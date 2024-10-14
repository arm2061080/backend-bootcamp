public class App {
    public static void main(String[] args) {
        // Instantiate deck and players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle deck
        deck.shuffle();

        // Players draw 26 cards each
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Play 26 rounds
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Round " + (i + 1));
            card1.describe();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round.");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round.");
            } else {
                System.out.println("It's a tie. No points awarded.");
            }
            System.out.println("Current Score: Player 1 - " + player1.getScore() + " | Player 2 - " + player2.getScore());
            System.out.println();
        }

        // Final score
        System.out.println("Final Score: Player 1 - " + player1.getScore() + " | Player 2 - " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
