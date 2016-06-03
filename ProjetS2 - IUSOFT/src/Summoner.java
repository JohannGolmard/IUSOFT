import java.util.Random;

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
	
	private int sanity;
	
	/**
	 * this attribute represents the deck of the player with all the cards in.
	 */
	private Deck playerDeck;
	
	/**
	 * this attribute represents the hand of the player
	 */
	private Hand playerHand;
	
	private PlayerBoard board;
	
	private boolean actionTaken = false;

	
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
		this.playerHand= new Hand();
		this.board=new PlayerBoard();		
	}
	
	
	/**
	 * represent an effect of the summoner .
	 */
	public void effect(){
		this.actionTaken = true;
	}

	
	public void meditate(){
		this.souls++;
		this.actionTaken = true;
	}
	
	
	/**
	 * place the specified card onto the specified location of the board
	 * @param c
	 */
	public void takeCard(PlayableCard card){
		if(this.souls<card.getSoulCost() || this.intelligence<card.getNeededIntelligence() || this.resistance<card.getNeededResistance() || this.sanity<card.getNeededSanity()){
			System.out.println("Prérequis non respectés");
		}	
		else{
			if (card.getType() == "spell"){
				card.effect();
			}
			else{
				this.board.placeCard(card);
			}
		}
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

	
	public int getSanity() {
		return sanity;
	}

	
	public void setSanity(int sanity) {
		this.sanity = sanity;
	}

	
	/**
	 * Return a random card from the hand of the summoner
	 * @return a card
	 */
	public PlayableCard getRandomCard(){
		Random rng = new Random();
		return this.playerHand.get(rng.nextInt(this.playerHand.size()));
	}
}
