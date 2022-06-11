package App;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name; // Player Name
	private Card cardDrawPlayer; //Place Holder

	/*
	 * Constructor with name pass
	 * 
	 */

	Player(String name) {
		cardDrawPlayer = null;
		score = 0;
		this.name = name;

	}

	/*
	 * Print Name and Score
	 */

	public void describe() {
		System.out.println("Player Name: " + name + " Score: " + score);

	}

	/*
	 * Remove card from player hand to compare
	 */

	public Card flip() {
		return hand.remove(0);

	}

	/*
	 * Add card to hand
	 */
	public void draw(Deck drawDeck) {

		cardDrawPlayer = drawDeck.draw();
		hand.add(cardDrawPlayer);

	}

	//Tally
	public void incrementScore() {
		score++;
	}

	//Getter
	public int getScore() {
		return score;
	}

	// Print Hand
	public void printHand() {

		for (Card card : hand) {
			card.describe();
		}

	}
}
