import java.util.Random;

/**
 * This class represents the board of one player. This board is fill with card.
 * The board of the player cannot exceed 5 row long and 3 column long.
 * @author IUSOFT (initialized by golmard / filled by george)
 *
 */
public class PlayerBoard
{
	/**
	 * represents the length of the playerboard's row by a constant
	 */
	public static final int BOARD_ROW_LENGTH = 5;
	/**
	 * represents the length of the playerboard's column by a constant
	 */
	public static final int BOARD_COL_LENGTH = 3;
	
	/**
	 * The board of the player represented by a grid of card.
	 */
	private PlayableCard[][] board;
	
	private Summoner sum;
	
	public PlayerBoard(Summoner s){
		this.board=new PlayableCard[BOARD_ROW_LENGTH][BOARD_COL_LENGTH];
		this.sum=s;
	}
	
	/**
	 * return the summoner associate with the board
	 * @return sum
	 */
	public Summoner getSummoner(){
		return this.sum;
	}
	/**
	 * Check if the case of the board is empty
	 * @param row of the board
	 * @param column of the board
	 * @return boolean
	 */
	public boolean isEmpty(int row, int col){
		if (this.board[row][col] == null){
			return true;
		}
		return false;
	}
	/**
	 * Check if the card is the same at the one present in the board
	 * @param row of the board
	 * @param column of the board
	 * @param card
	 * @return boolean
	 */
	public boolean checkCard(int row, int col, PlayableCard card){
		if(this.board[row][col]==card)
			return true;
		else
			return false;
	}
	/**
	 * Place a card into the player's board
	 * @param row of the board
	 * @param column of the board 
	 * @param card to place
	 */
	public void placeCard(int row, int col, PlayableCard card){
		this.board[row][col]=card;
	}
	/**
	 * Destroy the card present in the board
	 * @param row of the board where the card is present
	 * @param column of the board where the card is present
	 */
	public void destroyCard(int row, int col){
		this.board[row][col]=null;
	}
	/**
	 * Return a random card from the board
	 * @return card
	 */
	public PlayableCard getRandomCard(){
		Random rng = new Random();
		Random rnj = new Random();
		return this.board[rng.nextInt(this.board.length)][rnj.nextInt(this.board.length)];
	}
	
}
