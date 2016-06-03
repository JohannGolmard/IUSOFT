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
	
	public PlayerBoard(){
		this.board=new PlayableCard[BOARD_ROW_LENGTH][BOARD_COL_LENGTH];
	}
	
	
	/**
	 * Check if the slot of the board is empty
	 * @param row of the board
	 * @param column of the board
	 * @return boolean
	 */
	public boolean isEmpty(int row, int col){
		return (this.board[row][col] == null);
	}
	
	
	/**
	 * Place a card into the player's specified board slot
	 * @param row of the board
	 * @param column of the board 
	 * @param card to place
	 */
	public void placeCard(PlayableCard card){
		int row = /*ask the player for row*/;
		int col = /*ask the player for column*/;
		this.board[row][col]=card;
	}
	
	
	/**
	 * Destroy the card present in the specified slot
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
	
	
	public void checkBoard(String action){
		for (int i=0; i<BOARD_COL_LENGTH; i++){
			for (int j=0; j<BOARD_ROW_LENGTH; j++){
				this.board[i][j].checkEffect();
			}
		}
	}
	}
