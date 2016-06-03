import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private final String deckName;
	private ArrayList<PlayableCard> deck;
	
	
	public Deck(String name){
		this.deckName = name;
		this.deck = new ArrayList<PlayableCard>();
	}
	public Deck(String name,ArrayList<PlayableCard> array){
		this.deckName=name;
		this.deck=array;
	}
	
	
	/**
	 * Draw the first card of the deckList
	 * @return
	 */
	public PlayableCard draw(){
		return this.deck.remove(0);
	}
	
	
	public void shuffle(){
		
		Random rnd = new Random();
		ArrayList<PlayableCard> shuffledDeck = new ArrayList<PlayableCard>();
		
		for (int index=0; index<deck.size(); index++){
			shuffledDeck.add(this.deck.remove(rnd.nextInt(this.deck.size())));
		}
		
		this.deck = shuffledDeck;
	}
	public boolean isEmpty(){
		return(this.deck.isEmpty());
	}
	
	
	/**
	 * Search the card card into the deck
	 * @param card
	 * @return
	 */
	public PlayableCard search(PlayableCard card){	
		return this.deck.remove(this.deck.indexOf(card));
	}

}
