package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	private static final Object lock = new Object();
	private static Deck singletonInstance;
	
	
	public Deck() {
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = { Suit.ESPADAS, Suit.COPAS, Suit.OUROS, Suit.DIAMANTES };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
		// shuffle it!
		Collections.shuffle(cards, new Random());
	}
	
	
	public static Deck getInstance() {
		synchronized (lock) {
			if (singletonInstance == null)
				singletonInstance = new Deck();
		}

		return singletonInstance;
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

	private List<Card> cards;
}
