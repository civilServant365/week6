package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private Card cardDrawDeck;
	
	//Constructor to set name and value of each card- add to the list 
	public Deck() {

		for (int z = 0; z <= 3; z++) {

			for (int i = 2; i <= 14; i++) {

				Card card = new Card(z, i);

				cards.add(card);
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		cardDrawDeck = cards.remove(0);
		return cardDrawDeck;
	}
	
	public void printDeck() {
		
		for (Card card : cards) {
		card.describe();
	}
	}

}
