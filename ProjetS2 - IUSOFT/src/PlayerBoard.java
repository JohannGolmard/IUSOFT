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
	private PlayCard[][] board;
	//TODO adapter à la classe cardtoplay
	
	/**
	 * 
	 */
	public PlayerBoard(){
		this.board=new PlayCard[8][8];
		//TODO revoir le constructeur
	}
	/**
	 * Return the board of the player.
	 * @return board
	 */
	public PlayCard[][] getBoard(){
	//TODO adapter à la classe CardToPlay
		return this.board;
	}
	
}
