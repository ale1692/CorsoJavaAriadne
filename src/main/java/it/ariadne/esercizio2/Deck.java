package it.ariadne.esercizio2;

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
				int rank= rankEnum.getRank();
				int suit= suitEnum.getSuit();
				deck.add(new Card(rank,suit));
			}

		}

	}
	
	public void removeCards() {
		deck.clear();
	}
	
	public Card getCard(int suit, int rank) {
		for (Card card : deck) {
			if(card.getRank() == rank && card.getSuit() == suit){
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
