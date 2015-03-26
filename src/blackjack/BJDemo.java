package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		
		System.out.print("What is your name?: ");
		String name = scan.next();
		
		System.out.print("Hi " + name + ", how many rounds would you like to play?: ");
		int rounds = scan.nextInt();
		
		System.out.println("Ok " + name + " let's play " + rounds + " rounds!\n");

		
		for(int i = 0; i < rounds; i++) {
			GetCards hands = new GetCards();
			List<String> p1Cards = new ArrayList<>();
			p1Cards = hands.getHand();
			System.out.println("New Round!");
			System.out.print("Your Cards: " + p1Cards);
			System.out.println(" ...hit or stay?: ");
			String turn = scan.next();
			CardValue cv = new CardValue();
			while(turn.equalsIgnoreCase("hit")) {
				p1Cards = hands.nextCard();
				if(cv.getValue(p1Cards) > 21) {
					System.out.println(p1Cards + " Bust!");
					break;
				}
				System.out.println("Your Cards Now: " + p1Cards + " ...hit or stay?: ");
				turn = scan.next();
			}
			List<String> dealerCards = new ArrayList<>();
			dealerCards = hands.getDealerCards();
			System.out.println("Dealer's cards: " + dealerCards + "\n");
			if(cv.getValue(p1Cards) > cv.getValue(dealerCards) && cv.getValue(p1Cards) <= 21) {
				counter++;
				System.out.println("You win this round!!\n");
			}
			else if(cv.getValue(dealerCards) > cv.getValue(p1Cards) && cv.getValue(dealerCards) > 21 && cv.getValue(p1Cards) > 21) {
				System.out.println("You both bust!\n");
			}
			else if(cv.getValue(dealerCards) > cv.getValue(p1Cards) && cv.getValue(dealerCards) > 21) {
				counter++;
				System.out.println("You win this round!!\n");
			}
			else if(cv.getValue(p1Cards) == cv.getValue(dealerCards)) {
				System.out.println("Draw!!\n");
			}
			else {
				System.out.println("You lost the round!\n");
			}
			//System.out.println(cv.getValue(p1Cards) + " " + cv.getValue(dealerCards));

		}
		
		System.out.println("Game Over, You won " + counter + " out of " + rounds + " rounds!!");
		
	}

}
