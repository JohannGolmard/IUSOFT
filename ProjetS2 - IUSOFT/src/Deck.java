import java.util.List;

public class Deck {
	private List<PlayableCard> deckList;
	
	public Deck(List<PlayableCard> d){
		this.deckList=d;
	}
	/**
	 * Draw the first card of the deckList
	 * @return
	 */
	public PlayableCard draw(){
		PlayableCard c;
		c=this.deckList.get(0);
		this.deckList.remove(0);
		return c;
	}
	public void shuffle(){
		
		//...
	}
	/**
	 * Search the card c into the deckList
	 * @param c
	 * @return
	 */
	public PlayableCard search(PlayableCard c){	
			PlayableCard card;
			card=this.deckList.get(this.deckList.indexOf(c));
			this.deckList.remove(this.deckList.indexOf(c));
			return card;
		
	
	}

}
