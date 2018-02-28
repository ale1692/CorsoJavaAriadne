package it.ariadne.test.esercizio2;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.esercizio2.Card;
import it.ariadne.esercizio2.Deck;
import it.ariadne.esercizio2.RankEnum;
import it.ariadne.esercizio2.SuitEnum;

public class TestDeck {

	private Card card;
	private Deck deck;
	private List<Card> list;

	@Before
	public void setup() {
		card = new Card(10, 4);
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
	public void testString() {
		Assert.assertEquals("Test conversion: ", "Ten", card.rankToString(card.getRank()));

	}

	@Test
	public void testValidSuit() {
		Assert.assertTrue("Test valid suit: ", card.isValidSuit(card.getSuit()));

	}

	@After
	public void afterTest() {

		for (Card deckList : list) {
			System.out.println("Seme: " + deckList.suitToString(deckList.getSuit()) + " ---- Valore: "
					+ deckList.rankToString(deckList.getRank()));
		}

	}

}
