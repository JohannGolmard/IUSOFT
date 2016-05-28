/**
 * This class represents the board of one player. This board is fill with card.
 * @author IUSOFT (initialized by golmard / filled by george)
 *
 */
public class PlayerBoard
{
	public static final int BOARD_ROW_LENGHT = 5;
	public static final int BOARD_COL_LENGHT = 3;
	
	/**
	 * The board of the player represented by a grid of card.
	 */
	private final PlayableCard[][] board;
	
	/**
	 * 
	 */
	public PlayerBoard(){
		this.board=new PlayableCard[BOARD_COL_LENGHT][BOARD_ROW_LENGHT];
	}
	
	/**
	 * Return the board of the player.
	 * @return board
	 */
	/*public PlayableCard[][] getBoard(){
		return this.board;
	}*/
	
	
	public boolean isEmpty(int row, int col){
		if (board[row][col] == null){
			return true;
		}
		return false;
	}
	
	public void placeCard(int row, int col, PlayableCard card){
		this.board[row][col]=card;
	}
	
	public void destroyCard(int row, int col){
		this.board[row][col]=null;
	}
	
}
