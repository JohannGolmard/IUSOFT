/**
 * represents a playable card and the conditions to play this card. 
 * @author pintrant
 *
 */

public abstract class PlayableCard {
	/**
	 * Represents the cost in soul point of the card
	 */
	private int soulCost;
	/**
	 * represents the type of the card
	 */
	private final String type;
	/**
	 * generate a card to play
	 * @param soulCost
	 */
	protected PlayableCard(int soulCost, String type) {
		super();
		this.soulCost= soulCost;
		this.type=type;
	}
	public int getSoulCost() {
		return soulCost;
	}
	public void setSoulCost(int soulCost) {
		this.soulCost = soulCost;
	}
	public String getType(){
		return this.type;
	}	
}
		

	


