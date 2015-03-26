package blackjack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardValue {
	
	private Map<String, Integer> deckValues = new HashMap<>();
	
	public int getValue(List<String> playerCards) {
		deckValues.put("2C", 2);
        deckValues.put("2D", 2);
        deckValues.put("2H", 2);
        deckValues.put("2S", 2);
        deckValues.put("3C", 3);
        deckValues.put("3D", 3);
        deckValues.put("3H", 3);
        deckValues.put("3S", 3);
        deckValues.put("4C", 4);
        deckValues.put("4D", 4);
        deckValues.put("4H", 4);
        deckValues.put("4S", 4);
        deckValues.put("5C", 5);
        deckValues.put("5D", 5);
        deckValues.put("5H", 5);
        deckValues.put("5S", 5);
        deckValues.put("6C", 6);
        deckValues.put("6D", 6);
        deckValues.put("6H", 6);
        deckValues.put("6S", 6);
        deckValues.put("7C", 7);
        deckValues.put("7D", 7);
        deckValues.put("7H", 7);
        deckValues.put("7S", 7);
        deckValues.put("8C", 8);
        deckValues.put("8D", 8);
        deckValues.put("8H", 8);
        deckValues.put("8S", 8);
        deckValues.put("9C", 9);
        deckValues.put("9D", 9);
        deckValues.put("9H", 9);
        deckValues.put("9S", 9);
        deckValues.put("TC", 10);
        deckValues.put("TD", 10);
        deckValues.put("TH", 10);
        deckValues.put("TS", 10);
        deckValues.put("JC", 10);
        deckValues.put("JD", 10);
        deckValues.put("JH", 10);
        deckValues.put("JS", 10);
        deckValues.put("QC", 10);
        deckValues.put("QD", 10);
        deckValues.put("QH", 10);
        deckValues.put("QS", 10);
        deckValues.put("KC", 10);
        deckValues.put("KD", 10);
        deckValues.put("KH", 10);
        deckValues.put("KS", 10);
        deckValues.put("AC", 11);
        deckValues.put("AD", 11);
        deckValues.put("AH", 11);
        deckValues.put("AS", 11);
        
        int total = 0;
        for(int i = 0; i < playerCards.size(); i++) {
        	total += deckValues.get(playerCards.get(i));
        }
        
        return total;
	}

}
