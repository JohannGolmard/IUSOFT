/**
 * 
 * @author golmardj
 *
 */
//TODO complete the comment
public abstract class CardToPlay extends Card {
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
	 * if the cardv is a creature: give the choice between attack mode and defense mode
	 * if the card is a spell activate the effect
	 */
	public void playACard(){
		//TODO write code
	}
}
