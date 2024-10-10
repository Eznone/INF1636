package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
    private static Deck instance;
    private List<String> cards;

    // Private makes it so that no other deck can be made from outside
    private Deck() {
        cards = initializeDeck(8);
    }

    // Makes the singular possible deck through the use of static
    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    // Initialize the deck with 52 cards
    private List<String> initializeDeck(int numDecks) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();
        
        // Forloops to add cards for 8 total decks
        for (int i = 0; i < numDecks; i++) {
        	for (String suit : suits) {
            	for (String value : values) {
                	deck.add(value + " of " + suit);
            	}
        	}
        }
        
        return deck;
        
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw a card from the deck
    public String drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No more cards in the deck!");
        }
        return cards.remove(cards.size() - 1);
    }
}