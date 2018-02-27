package it.ariadne.esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> deck = new ArrayList<>();

	public Deck() {
		addCards();
	}

	private void addCards() {

		for (SuitEnum suitEnum : SuitEnum.values()) {
			for (RankEnum rankEnum : RankEnum.values()) {

				deck.add(new Card(rankEnum,suitEnum));
			}

		}

	}
	
	public void removeCards() {
		deck.clear();
	}
	
	public Card getCard(SuitEnum suit, RankEnum rank) {
		for (Card card : deck) {
			if(card.getRank().equals(rank) && card.getSuit().equals(suit)){
				return card;
			}
		}
		return null;
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	

}
