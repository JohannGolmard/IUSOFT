/**
 * this class represents the board of each player in the game
 * @author golmardj
 *
 */
public class GameBoard
{
	/**
	 * The board of the first player
	 */
	private PlayerBoard firstPlayerBoard;
	/**
	 * The board of the second player
	 */
	private PlayerBoard secondPlayerBoard;
	
	/**
	 * Creates a new GameBoard with two board initiate for each player.
	 * @param fplayerboard
	 * @param splayervoard
	 */
	public GameBoard(){
		this.firstPlayerBoard= new PlayerBoard();
		this.secondPlayerBoard= new PlayerBoard();
	}

	/**
	 * Return the board of the first player
	 * @return firstPlayerBoard
	 */
	public PlayerBoard getFirstPlayerBoard()
	{
		return firstPlayerBoard;
	}
	/**
	 * Return the board of the second player
	 * @return secondPlayerBoard
	 */
	public PlayerBoard getSecondPlayerBoard()
	{
		return secondPlayerBoard;
	}

	
}
