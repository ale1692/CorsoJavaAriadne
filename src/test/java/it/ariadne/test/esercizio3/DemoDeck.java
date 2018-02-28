package it.ariadne.test.esercizio3;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.esercizio3.Card;
import it.ariadne.esercizio3.Deck;
import it.ariadne.esercizio3.RankEnum;
import it.ariadne.esercizio3.SuitEnum;

public class DemoDeck {

	private Card card1;
	private Card card2;
	private Card card3;
	private Deck deck;
	private List<Card> list;

	@Before
	public void setup() {

		card1 = new Card(RankEnum.ACE, SuitEnum.PICCHE);
		card2 = new Card(RankEnum.DEUCE, SuitEnum.PICCHE);
		card3 = new Card(RankEnum.DEUCE, SuitEnum.PICCHE);
		deck = new Deck();
		list = deck.getDeck();
	}

	@Test
	public void testSizeList() {

		RankEnum[] rankEnum = RankEnum.values();
		SuitEnum [] suitEnum = SuitEnum.values();
		Assert.assertEquals("Test conversion: ", rankEnum.length * suitEnum.length, list.size());

	}
	
	
	@Test
	public void testEquals1() {
		Assert.assertTrue("Test equals method N.1: ", card2.equals(card3));
	}

	@Test
	public void testEquals2() {
		String str1 = new String("hello");
		Assert.assertTrue("Test equals method N.2: ", card1.equals(str1));
	}

	@After
	public void afterTest() {
		
		System.out.println("Deck:");

		for (Card deckList : list) {
			System.out.println(deckList.toString());
		}

	}

}
