import java.util.Random;

/***
 * this class represent the summoner's card
 * @author pintrant
 *
 */

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
	
	private int sanity;
	
	/**
	 * this attribute represents the deck of the player with all the cards in.
	 */
	private Deck playerDeck;
	/**
	 * this attribute represents the hand of the player
	 */
	private PlayableCard[] hand;
	
	private PlayerBoard board;
	
	private boolean spellUsed = false;

	
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
		this.hand= new PlayableCard[8];
		this.board=new PlayerBoard(this);
		for (int i=0;i<5;i++)
			this.hand[i]=this.playerDeck.draw();
		
	}
	/**
	 * represent an effect of the summoner .
	 */
	public void effect(){
		//...
	}

	public void meditate(){
		//...
	}
	
	/**
	 * Summon a monster from the summoner's hand to his board
	 * @param c
	 */
	public void summonMonster(PlayableCard c){
		if(this.souls<c.getSoulCost() || this.intelligence<c.getNeededIntelligence() || this.resistance<c.getNeededResistance() || this.sanity<c.getNeededSanity()){
			System.out.println("Prérequis non respecté");
		}
		else{
			for(int i=0;i<5;i++){
				for(int j=0;j<3;j++){
					if(this.board.isEmpty(i, j)){
						this.board.placeCard(i, j, c);
						for(int k=0;k<8;k++){
							if(this.hand[k] == c)
								this.hand[k] = null;
							k++;
						}
					}
					j++;
				}
				i++;
			}
		}
			
	}
	/**
	 * Use a card spell from the summoner's hand
	 */
	public void useSpell(){
		if(this.spellUsed==false){
			//...
			
			this.spellUsed = true;
		}
	}
	/**
	 * equip the monster from the summoner's board with a equipment from the summoner's hand
	 * @param playableCard
	 * @param playableCard2
	 */
	public void equipMonster(PlayableCard playableCard,PlayableCard playableCard2){
		((Creature) playableCard).setAttack(((Creature) playableCard).getAttack()+((Creature) playableCard2).getAttack());
		((Creature) playableCard).setDefense(((Creature) playableCard).getDefense()+((Creature) playableCard2).getDefense());
		((Creature) playableCard).setHealth(((Creature) playableCard).getHealth()+((Creature) playableCard2).getHealth());
		for(int i=0;i<8;i++){
			if(this.hand[i]==playableCard2)
				this.hand[i]=null;
			i++;
		}
	}
	/**
	 * Attack the enemy's monster with a monster from the summoner's board
	 * @param playableCard
	 * @param playableCard2
	 */
	public void attackWithMonster(PlayableCard playableCard,PlayableCard playableCard2){
		if(((Creature) playableCard).getDefense() == 0)
			((Creature) playableCard).setHealth(((Creature) playableCard).getHealth()-((Creature) playableCard2).getAttack());		
		else
			((Creature) playableCard).setDefense(((Creature) playableCard).getDefense()-((Creature) playableCard2).getAttack());
	}
	/**
	 * Use a trap card from the summoner's hand
	 */
	public void useTrapCard(){
		//...
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
	 * return the player's deck
	 */
	public Deck getPlayerDeck() {
		return this.playerDeck;
	}

	public void setPlayerDeck(Deck playerDeck) {
		this.playerDeck = playerDeck;
	}
	public int getSanity() {
		return sanity;
	}
	public void setSanity(int sanity) {
		this.sanity = sanity;
	}
	public PlayableCard[] getHand(){
		return this.hand;
	}
	@Override
	public boolean checkEffect() {
		//...
		return false;
	}
	/**
	 * Return the board of the summoner
	 * @return PlayerBoard
	 */
	public PlayerBoard getPlayerBoard() {		
		return this.board;
	}
	/**
	 * Return a random card from the hand of the summoner
	 * @return a card
	 */
	public PlayableCard getRandomCard(){
		Random rng = new Random();
		return this.hand[rng.nextInt(this.hand.length)];
	}
	

}
