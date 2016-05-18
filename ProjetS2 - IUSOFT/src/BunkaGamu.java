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
	 * Then the player choose is action :
	 *  -case skill of summoner
	 *  -case summon creature while the summoner has the specified condition to invoke it 
	 *  -case Use a spell from his hand
	 * 	-case Equip one of his creature on his board with a equipment from his hand
	 * 	-case Attack , the player use one of his creature to Attack the enemy
	 *  -case Play a card , the summoner put a trap card on his board, which can't be activate on the same turn of the summoner who play it.
	 *  
	 *  the winner is the first summoner to down the summoner enemy at 0 life point
	 */
	public void play(){
		
	}	
}
