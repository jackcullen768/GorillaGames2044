import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// menu
		//public void displayMenu();
		//public void createFullDeck() {
			
	
		
		Card neeson = new Card("Liam Neeson", 69,	65, 85,	1.83, 96);
		Card mcaleese = new Card( "Mary McAleese", 56, 89, 34, 1.54, 93);
		Card odriscoll = new Card( "Brian O'Driscoll", 76,	85, 95,	1.73, 99);
		Card heaney = new Card("Seamus Heaney", 46, 35, 94, 1.65, 85);
		
	ArrayList<Card> cards = new ArrayList<Card>();
	cards.add(neeson);
	cards.add(mcaleese);
	cards.add(odriscoll);
	
		//playingDeck.createFullDeck();
		//playingDeck.shuffle();
		//Create a deck for the player
		Deck playerDeck = new Deck();
		Deck playerHand = new Deck();
		
		Deck opponentDeck = new Deck();
		Deck opponentHand = new Deck();
		
		Scanner userInput = new Scanner(System.in);
		
		// game loop
		while(playerDeck.size() > 0 && opponentDeck.size() > 0 ){
			cards.shuffle()
			playerHand.draw(playerDeck);
			playerHand.draw(playerDeck);
			playerHand.draw(playerDeck);
			System.out.println("Your Hand");
			System.out.println(playerHand.toString());
			
			
			
			
			System.out.println("Which Card Would You Like To Pick?");
			Card playerCard = userInput.nextCard();	 //create a playerCard object/method
			System.out.println("Which Stat Would You Like To Pick?");
			int playerStat = userInput.nextint();	//create a player stat object/method
			//player stat not developed yet that will be done using
			// touch function developed later
			if (playerStat > opponentStat){
				System.out.println("Player 1 wins");
				System.out.println("You have won your opponents card");
				opponentDeck.removeCard(opponentCard);
				playerDeck.addCard(opponentCard);
				
				
			}
			else if (opponentStat > playerStat){
				System.out.println("Computer wins");
				System.out.println("You have lost your card");
				playerDeck.removeCard(playerCard);
				opponentDeck.addCard(opponentCard);
				
		}
			else {
				System.out.println("Tiebreak");
			}
			
			
		}
		System.out.println("Game Over");
		

	}

}
