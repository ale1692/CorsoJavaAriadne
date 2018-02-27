package it.ariadne.test.esercizio2;


import java.util.List;

import it.ariadne.esercizio2.Card;
import it.ariadne.esercizio2.Deck;

public class TestDeck {

	public static void main(String[] args) {
		
		//Error Exception Assert
		//Card card = new Card(10, 5);
		Card card = new Card (10,4);
		System.out.println(card.rankToString(card.getRank()));
		
		Deck deck = new Deck();
		List <Card> list=deck.getDeck();
		
		System.out.println("Deck:");
		
		for (Card deckList: list) {
			System.out.println("Seme: " + deckList.suitToString(deckList.getSuit()) + " ---- Valore: " + deckList.rankToString(deckList.getRank()));
		}
		
	}
}
