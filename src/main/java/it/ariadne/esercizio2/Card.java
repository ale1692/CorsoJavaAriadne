package it.ariadne.esercizio2;

public class Card {

	private int rank;
	private int suit;

	public Card(int rank, int suit) {
		assert (isValidSuit(suit));
		assert (isValidRank(rank));
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public boolean isValidSuit(int suit) {
		return (suit >= 1 && suit <= SuitEnum.PICCHE.getSuit());
	}

	public boolean isValidRank(int rank) {
		return (rank >= RankEnum.ACE.getRank() && rank <= RankEnum.KING.getRank());
	}

	public String rankToString(int rank) {
		RankEnum[] r = RankEnum.values();

		for (RankEnum rankEnum : r) {
			if (rankEnum.getRank() == rank) {

				String temporary = String.valueOf(rankEnum);
				String rankConversion = String.valueOf(temporary.charAt(0))
						+ temporary.substring(1, temporary.length()).toLowerCase();
				return rankConversion;
			}
		}
		return null;
	}

	public String suitToString(int suit) {
		SuitEnum[] s = SuitEnum.values();

		for (SuitEnum suitEnum : s) {
			if (suitEnum.getSuit() == suit) {

				String temporary = String.valueOf(suitEnum);
				StringBuilder builder = new StringBuilder();
				builder.append(String.valueOf(temporary.charAt(0)))
						.append(temporary.substring(1, temporary.length()).toLowerCase());
				
				return builder.toString();
			}
		}
		return null;
	}

}
