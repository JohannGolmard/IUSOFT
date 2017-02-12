import java.util.Random;
import java.util.Scanner;

/***
 * this class represent the summoner's card
 * @author IUSOFT (initialized be pintrant/completed by george)
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
	 * @param playerDeck
	 */
	public Summoner(int hp, int souls, Deck playerDeck){
		this.health=hp;
		this.souls=souls;
		this.playerDeck=playerDeck;
		this.playerHand= new Hand();
		this.board=new PlayerBoard();		
	}
	
	public void meditate(){
		this.souls++;
		this.actionTaken = true;
	}	
	/**
	 * place the specified card onto the specified location of the board
	 * @param c
	 */
	public void takeCard(int index){
		if(this.souls<this.playerHand.get(index).getSoulCost()){			
			System.out.println(this.souls);
			System.out.println("Prérequis non respectés");
		}	
		else{			
			this.board.placeCard(this.playerHand.get(index));
			this.playerHand.removeCard(index);
			System.out.println("Carte placé");
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
	
	public PlayerBoard getBoard(){
		return this.board;
	}
	public Hand getHand(){
		return this.playerHand;
	}
	public Deck getPlayerDeck(){
		return this.playerDeck;
	}
	public void attackWithMonster(PlayableCard playableCard,PlayableCard playableCard2){		 		
		((Creature) playableCard).setHealth(((Creature) playableCard).getHealth()-((Creature) playableCard2).getAttack());
	}	
	/**
	 * Return a random card from the hand of the summoner
	 * @return a card
	 */
	public int getRandomCard(){
		Random rng = new Random();
		return rng.nextInt(this.playerHand.size());
	}
}
