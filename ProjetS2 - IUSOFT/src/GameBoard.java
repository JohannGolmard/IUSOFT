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
	public GameBoard(Summoner player1, Summoner player2){
		this.firstPlayerBoard= player1.getBoard();
		this.secondPlayerBoard= player2.getBoard();
	}
	
}
