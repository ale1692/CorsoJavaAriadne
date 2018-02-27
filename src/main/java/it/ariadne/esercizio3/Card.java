package it.ariadne.esercizio3;

public class Card {

	private RankEnum rank;
	private SuitEnum suit;

	public Card(RankEnum rank, SuitEnum suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public RankEnum getRank() {
		return rank;
	}

	public void setRank(RankEnum rank) {
		this.rank = rank;
	}

	public SuitEnum getSuit() {
		return suit;
	}

	public void setSuit(SuitEnum suit) {
		this.suit = suit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			if ((this.getRank() == ((Card) obj).getRank()) && (this.getSuit() == ((Card) obj).getSuit())) {
				return true;

			}

			else {
				return false;
			}

		}

		return false;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Seme: " + String.valueOf(suit) + " - - Valore: " + String.valueOf(rank);
	}
}
