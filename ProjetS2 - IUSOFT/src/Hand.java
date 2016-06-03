import java.util.ArrayList;

public class Hand {

	private final static int MAX_CARDS = 10;
	
	private final ArrayList<PlayableCard> hand;

	public Hand() {
		this.hand = new ArrayList<PlayableCard>();
	}
	
	public void discardHand(){
		this.hand.clear();
	}

	public void addCard(PlayableCard card) {
		this.hand.add(card);
	}
	
	public int size(){
		return this.hand.size();
	}
	
	public PlayableCard get(int index){
		return this.hand.get(index);
	}
}
