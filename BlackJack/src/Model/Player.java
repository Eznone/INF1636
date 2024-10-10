package Model;

import java.util.ArrayList;
import java.util.List;

// Player class
class Player {
    private String name;
    private List<String> hand;
    private int hundreds;
    private int fifties;
    private int twenties;
    private int tens;
    private int bet;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.hundreds = 10;
        this.fifties = 10;
        this.twenties = 20;
        this.tens = 20;
        this.bet = 0;
    }

    public void receiveCard(String card) {
        hand.add(card);
    }

    public List<String> getHand() {
        return hand;
    }
    
    // Used to display total money player has
    public int totalMoney() {
    	int total = hundreds * 100;
    	total += fifties * 50;
    	total += twenties * 20;
    	total += tens * 10;
    	return total;
    }
    
    // Method to track total bet
    public int totalBet() {
        return bet;
    }
    
    // Method to place a bet
    public boolean placeBet(int amount) {
        int remainingAmount = amount;

        // Deduct from hundreds
        while (remainingAmount >= 100 && hundreds > 0) {
            if (removeHundred()) {
                remainingAmount -= 100;
            }
        }

        // Deduct from fifties
        while (remainingAmount >= 50 && fifties > 0) {
            if (removeFifty()) {
                remainingAmount -= 50;
            }
        }

        // Deduct from twenties
        while (remainingAmount >= 20 && removeTwenty()) {
            remainingAmount -= 20;
        }

        // Deduct from tens
        while (remainingAmount >= 10 && removeTen()) {
            remainingAmount -= 10;
        }

        // If we were able to deduct the full amount, update the bet
        if (remainingAmount == 0) {
            bet += amount;  // Add the amount to the player's bet
            return true;
        }

        // If unable to cover the full bet amount, restore denominations and return false
        restoreFunds(amount - remainingAmount);
        return false;
    }
    
    // Method to double the player's current bet
    public boolean doubleBet() {
        int amountToDouble = bet;
        // Check if player can cover the double
        if (placeBet(amountToDouble)) {
            bet += amountToDouble;  // Double the current bet
            return true;
        }
        return false;  // Not enough funds to double the bet
    }
    
    private void restoreFunds(int amount) {
        while (amount >= 100) {
            hundreds++;
            amount -= 100;
        }
        while (amount >= 50) {
            fifties++;
            amount -= 50;
        }
        while (amount >= 20) {
            twenties++;
            amount -= 20;
        }
        while (amount >= 10) {
            tens++;
            amount -= 10;
        }
    }
    
    // Boolean becuase we want to say if player has token or not
    // Display error of fault of token if returns false
    public boolean removeHundred() {
    	if (hundreds != 0) {
    		hundreds -= 1;
    		return true;
    	}
    	return false;
    	
    }
    public boolean removeFifty() {
    	if (fifties != 0) {
    		fifties -= 1;
    		return true;
    	}
    	return false;
    	
    }
    public boolean removeTwenty() {
    	if (twenties != 0) {
    		twenties -= 1;
    		return true;
    	}
    	return false;
    	
    }
    public boolean removeTen() {
    	if (tens != 0) {
    		tens -= 1;
    		return true;
    	}
    	return false;
    	
    }
}
