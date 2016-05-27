/**
 * 
 * @author golmardj
 *
 */
//TODO complete the comment
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
	 * if the card is a creature: give the choice between attack mode and defense mode and activate his effect
	 * if the card is a spell activate the effect
	 */
	public void playACard(){
		//TODO write code
	}
	/**
	 * generate a card to play
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 */
	public PlayableCard(int soulCost, int neededSanity, int neededResistance,
			int neededIntelligence) {
		super();
		this.soulCost= soulCost;
		this.neededSanity=neededSanity;
		this.neededResistance=neededResistance;
		this.neededIntelligence=neededIntelligence;
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

}
