package it.ariadne.test.esercizio3;

import java.util.List;

import it.ariadne.esercizio3.Card;
import it.ariadne.esercizio3.Deck;
import it.ariadne.esercizio3.RankEnum;
import it.ariadne.esercizio3.SuitEnum;

public class DemoDeck {

	public static void main(String[] args) {
		
		
		Card card1 = new Card(RankEnum.ACE,SuitEnum.PICCHE);
		Card card2 = new Card(RankEnum.DEUCE,SuitEnum.PICCHE);
		Card card3 = new Card(RankEnum.DEUCE,SuitEnum.PICCHE);
		
		//Test Equals: False e True
		System.out.println("Test equals method N.1: " + card1.equals(card2));
		System.out.println("Test equals method N.2: " + card2.equals(card3));
		
		//Test Equals: False e True
		System.out.println("Test hashcode method N.1: " + card1.hashCode());
		System.out.println("Test hashcode method N.2: " + card2.hashCode());
		
		
		Deck deck = new Deck();
		List <Card> list=deck.getDeck();
		
		System.out.println("Deck:");
		
		for (Card deckList: list) {
			System.out.println(deckList.toString());
		}
		
	}
}
