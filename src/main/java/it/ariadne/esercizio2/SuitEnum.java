package it.ariadne.esercizio2;

public enum SuitEnum {

	CUORI(1), QUADRI(2), FIORI(3), PICCHE(4);

	private int suit;

	private SuitEnum(int suit) {
		this.suit = suit;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}


}
