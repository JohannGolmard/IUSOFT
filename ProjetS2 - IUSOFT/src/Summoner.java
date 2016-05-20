/***
 * this class represent the summoner's card
 * @author pintrant
 *
 */
//TODO complete the comments of this class
public class Summoner extends Card {
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
		this.health=hp;
		this.souls=souls;
		this.resistance=res;
		this.intelligence=intel;
		this.playerDeck=playerDeck;
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
	
	public void summonMonster(){
		
	}
	public void useSpell(){
		
	}
	public void equipMonster(){
		
	}
	public void attackWithMonster(){
		
	}
	public void useTrapCard(){
		
	}
	
	/**
	 * returns the player's life points
	 */
	public int getHealth() {
		return this.health;
	}
	/**
	 * set the player's life points
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * returns the player's soul points
	 */
	public int getSouls() {
		return this.souls;
	}
	/**
	 * set the player's soul points
	 */
	public void setSouls(int souls) {
		this.souls = souls;
	}
	/**
	 * returns the player's resistance points
	 */
	public int getResistance() {
		return this.resistance;
	}
	/**
	 * set the player's resistance points
	 */
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	/**
	 * returns the player's intelligence points
	 */
	public int getIntelligence() {
		return this.intelligence;
	}
	/**
	 * set the player's intelligence points
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	/**
	 * return the player's 
	 */
	public Deck getPlayerDeck() {
		return this.playerDeck;
	}

	public void setPlayerDeck(Deck playerDeck) {
		this.playerDeck = playerDeck;
	}
	
	
}
