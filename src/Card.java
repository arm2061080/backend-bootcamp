public class Card {
    // Fields for card value and name
    private int value; // card value (2-14 for cards 2-Ace)
    private String name; // card name (e.g., Ace of Diamonds)

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to describe the card
    public void describe() {
        System.out.println(name + " (" + value + ")");
    }

    // Main method to test the Card class
    public static void main(String[] args) {
        // Creating a Card instance and testing it
        Card card = new Card(14, "Ace of Spades");
        card.describe();
    }
}
