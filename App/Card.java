package App;

public class Card {

	private int value;                                //Card value 2-14
	private String name;							  // name of card
	private String[] nameOfSuits = new String[4];     //name of card for switch statement

	

	/*
	 * Constructor
	 */
	Card(int z, int i) {

		
		nameOfSuits[0] = "Clubs";
		nameOfSuits[1] = "Hearts";
		nameOfSuits[2] = "Spades";
		nameOfSuits[3] = "Diamonds";

		
		//Set name and value of each card
		switch (i) {

		case 2:
			setValue(i);
			setName("Two of " + nameOfSuits[z]);

			break;

		case 3:
			setValue(i);
			setName("Three of " + nameOfSuits[z]);
			break;
		case 4:
			setValue(i);
			setName("Four of " + nameOfSuits[z]);
			break;
		case 5:
			setValue(i);
			setName("Five of " + nameOfSuits[z]);
			break;
		case 6:
			setValue(i);
			setName("Six of " + nameOfSuits[z]);
			break;
		case 7:
			setValue(i);
			setName("Seven of " + nameOfSuits[z]);
			break;
		case 8:
			setValue(i);
			setName("Eight of " + nameOfSuits[z]);
			break;
		case 9:
			setValue(i);
			setName("Nine of " + nameOfSuits[z]);
			break;
		case 10:
			setValue(i);
			setName("Ten of " + nameOfSuits[z]);
			break;
		case 11:
			setValue(i);
			setName("Jack of " + nameOfSuits[z]);
			break;
		case 12:
			setValue(i);
			setName("Queen of " + nameOfSuits[z]);
			break;
		case 13:
			setValue(i);
			setName("King of " + nameOfSuits[z]);
			break;
		case 14:
			setValue(i);
			setName("Ace of " + nameOfSuits[z]);
			break;
		default:
			break;
		}
	}
/*
 * Getters and Setters
 */
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * Print Cards
	 */
	public void describe() {
		System.out.println("Name: " + getName() + " Value: " + getValue());

	}
}
