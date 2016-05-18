/**
 * This class represents a BunkaGamu game ready to play. The game is constitute of two player fighting against each other
 * They fight with deck of cards. Each card can be a specific type with a cost type for the player to use it/ invoke it.
 * The players have a limited amount of life point , and if one of them reach 0 , he loses the game. A player can be attack by the
 * creature of the player enemy , a card that use a spell , a trap card. 
 * @author golmardj
 *
 */
// BunkaGamu is the name of our game , may be it can change during the development of this project
public class BunkaGamu
{
	/**
	 * The board of the game
	 */
	private GameBoard board;
	
	public BunkaGamu(){
		this.board = new GameBoard();
	}

	/**
	 * The player who start receive one card from is deck 
	 * 
	 * 
	 * 
	 */
	public void play(){
		
	}	
}
