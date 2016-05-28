/**
 * represents a playable card and the conditions to play this card. 
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
	
	/**
	 * generate a card to play
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 */
	protected PlayableCard(int soulCost, int neededSanity, int neededResistance,
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
	
	public void playACard(Summoner player, PlayerBoard place){
		if(this.soulCost>player.getSouls()|| this.neededSanity>player.getSanity()||this.neededResistance>player.getResistance()|| this.neededIntelligence>player.getIntelligence()){
			System.out.println("Conditions non remplies");
		}
		else {
			player.setSouls(player.getSouls()-soulCost);
			player.setSanity(player.getSanity()-neededSanity);
			player.setResistance(player.getResistance()-neededResistance);
			player.setIntelligence(player.getIntelligence()-neededIntelligence);
			//place.getBoard() = this;
			}
		
			}
	}


