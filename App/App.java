package App;

public class App {

	public static void main(String[] args) {
		
		Card player1Flip;								//Placeholders for flipped card value							
		Card player2Flip;
		Player Player_1 = new Player("Player 1");    	//Player profiles with names passed 
		Player Player_2 = new Player("Player 2");		//into constructor
		Deck mainDeck = new Deck();						

		System.out.println("Fresh Deck of Cards: \n");

		mainDeck.printDeck();

		mainDeck.shuffle();

		System.out.println("\n\nShuffled Deck of Cards: \n");
		
		mainDeck.printDeck();
		//For loop to make each hand of 26 cards
		for (int i = 1; i <= 52; i++) {

			if (i % 2 == 1) {
				Player_1.draw(mainDeck);
			} else if (i % 2 == 0) {
				Player_2.draw(mainDeck);
			}
		}

		System.out.println("\n\nHand 1: \n");
		Player_1.printHand();

		System.out.println("\n\nHand 2: \n \n");
		Player_2.printHand();

		System.out.println("\n\n");
		//For loop to draw cards, compare and tally score with 
		//both players earning a point if there is a tie during a turn
		for (int i = 0; i <= 25; i++) {

			player1Flip = Player_1.flip();
			player2Flip = Player_2.flip();
		
			if (player2Flip.getValue() < player1Flip.getValue()) {
			
				Player_1.incrementScore();
			
			}
			else if (player2Flip.getValue() == player1Flip.getValue()) {
			
				Player_1.incrementScore();
				
				Player_2.incrementScore();
			
			}
			else if (player2Flip.getValue() > player1Flip.getValue()) {

				Player_2.incrementScore();
			}
		}
		//Print each players name and score
		Player_1.describe();
		
		System.out.println("\n");

		Player_2.describe();

		//Get final score and decide the winner
		
		if (Player_1.getScore() > Player_2.getScore()) {
			System.out.println("\nPlayer 1 is the victor!");
		}
		if (Player_1.getScore() < Player_2.getScore()) {
			System.out.println("Player 2 is the victor!");
		}
		if (Player_1.getScore() == Player_2.getScore()) {
			System.out.println("\nThe game was a draw.");
		}
	}

}
