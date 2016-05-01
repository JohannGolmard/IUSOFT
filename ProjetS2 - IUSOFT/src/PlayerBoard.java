/**
 * This class represents the board of one player. This board is fill with card.
 * @author golmardj
 *
 */
public class PlayerBoard
{
	/**
	 * The board of the player represented by a grid of card.
	 */
	private CardToPlay[][] board;
	//TODO adapter à la classe cardtoplay
	
	/**
	 * 
	 */
	public PlayerBoard(){
		this.board=new CardToPlay[8][8];
		//TODO revoir le constructeur
	}
	/**
	 * Return the board of the player.
	 * @return board
	 */
	public CardToPlay[][] getBoard(){
	//TODO adapter à la classe CardToPlay
		return this.board;
	}
	
}
