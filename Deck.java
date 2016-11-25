import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck(){
		this.cards = new ArrayList<Card>();
	}

	
	public void shuffle(){
		ArrayList<Card> tempdeck = new ArrayList<Card>();
		// Use Random
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for(int i = 0; i < this.cards.size(); i++ ){
			//Generate random index
			randomCardIndex = random.nextInt((this.cards.size()- 1 - 0) + 1);
			tempdeck.add(this.cards.get(randomCardIndex));
			//Remove from original deck
			this.cards.remove(randomCardIndex);
			
		}
		this.cards = tempdeck;
	}
	
	public void removeCard(Card i){
		this.cards.remove(i);
	}
	public Card getCard(int i){
		return this.cards.get(i);
	}
	public void addCard(Card addCard){
		this.cards.add(addCard);
	}
		// take card from deck
	public void draw(Deck comingfrom){
		this.cards.add(comingfrom.getCard(0));
		comingfrom.removeCard(card);
	}
	public int deckSize(){
		return this.cards.size();
	}
	public String toString(){
		String cardListOutput = "";
		for( Card aCard : this.cards){
			cardListOutput += "\n" + "-" + aCard.toString();

		}
		return cardListOutput;
				
	}
}
