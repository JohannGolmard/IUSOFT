/***
 * this class represent the summoner's card
 * @author pintrant
 *
 */
public class Summoner {
	/**
	 * this attribute represents the life points of the player 
	 */
	private int health;
	/**
	 * this attribute represents the soul points of the player. they are used to summon the creatures
	 */
	private int souls;
	/**
	 * this attribute represents the resistance points of the player 
	 */
	private int resistance;
	/**
	 * this attribute represents the intelligence points of the player 
	 */
	private int intelligence;
	/**
	 * this attribute represents the deck of the player with all the cards in.
	 */
	private Deck playerDeck;
	
	/**
	 * this is the constructor of a player.
	 * @param hp
	 * @param souls
	 * @param res
	 * @param intel
	 * @param playerDeck
	 */
	public Summoner(int hp, int souls, int res, int intel, Deck playerDeck){
		this.setHealth(hp);
		this.setSouls(souls);
		this.setResistance(res);
		this.setIntelligence(intel);
		this.setPlayerDeck(playerDeck);
	}
	/**
	 * represent an effect of the summoner .
	 */
	public void firstEffect(){
		//TODO write code
	}
	/**
	 * represent an other effect of the summoner card.
	 */
	public void secondEffect(){
		//TODO write code
	}
	/**
	 * 
	 */
	public void meditate(){
		//TODO write code
	}
	
	public void exercise(String skill){
		//TODO write code
	}
	
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSouls() {
		return souls;
	}

	public void setSouls(int souls) {
		this.souls = souls;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public Deck getPlayerDeck() {
		return playerDeck;
	}

	public void setPlayerDeck(Deck playerDeck) {
		this.playerDeck = playerDeck;
	}
	
	
	
}
