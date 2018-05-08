package Exercicio2;

enum Suit {
	ESPADAS, COPAS, OUROS, DIAMANTES
}

public class Card {
	public Card(Suit s, int n) {
		suit = s;
		if ((n < 2) || (n > 14)) {
			throw new IllegalArgumentException();
		}
		number = n;
	}

	public void print() {
		switch (number) {
		case 11:
			System.out.print("Valete");
			break;
		case 12:
			System.out.print("Rainha");
			break;
		case 13:
			System.out.print("Rei");
			break;
		case 14:
			System.out.print("Ás");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" de ");
		switch (suit) {
		case ESPADAS:
			System.out.println("espadas.");
			break;
		case COPAS:
			System.out.println("copas.");
			break;
		case OUROS:
			System.out.println("ouros.");
			break;
		case DIAMANTES:
			System.out.println("diamantes.");
			break;
		}
	}

	private Suit suit;
	private int number;
}