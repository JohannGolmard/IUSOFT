/**
 * represents a playable card and the conditions to play this card. 
 * @author pintrant
 *
 */

public abstract class PlayableCard extends Card {
	/**
	 * Represents the cost in soul point of the card
	 */
	private int soulCost;
	/**
	 * Represents the sanity of the card that the player need to have.
	 */
	private int neededSanity;
	/**
	 * Represents the resistance of the card that the player need to have.
	 */
	private int neededResistance;
	/**
	 * Represents the intelligence of the card that the player need to have.
	 */
	private int neededIntelligence;
	
	/**
	 * represents the trigger of the card
	 */
	private final String trigger;
	/**
	 * generate a card to play
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 */
	protected PlayableCard(int soulCost, int neededSanity, int neededResistance,
			int neededIntelligence,String trigger) {
		super();
		this.soulCost= soulCost;
		this.neededSanity=neededSanity;
		this.neededResistance=neededResistance;
		this.neededIntelligence=neededIntelligence;
		this.trigger=trigger;
	}
	public int getSoulCost() {
		return soulCost;
	}
	public void setSoulCost(int soulCost) {
		this.soulCost = soulCost;
	}
	public int getNeededSanity() {
		return neededSanity;
	}
	public void setNeededSanity(int neededSanity) {
		this.neededSanity = neededSanity;
	}
	public int getNeededResistance() {
		return neededResistance;
	}
	public void setNeededResistance(int neededResistance) {
		this.neededResistance = neededResistance;
	}
	public int getNeededIntelligence() {
		return neededIntelligence;
	}
	public void setNeededIntelligence(int neededIntelligence) {
		this.neededIntelligence = neededIntelligence;
	}
	
	public String getTrigger() {
		return trigger;
	}
			
	public void checkEffect(String effect){
		if(effect==this.trigger){
			this.effect();
		}
	}
	
}
		

	


