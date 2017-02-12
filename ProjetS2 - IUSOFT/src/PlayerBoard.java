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
	 * represents the length of the playerboard's column by a constant
	 */
	public static final int BOARD_COL_LENGTH = 5;
	private int indexNextCard=0;
	
	/**
	 * The board of the player represented by a grid of card.
	 */
	private PlayableCard[] board;

	/**
	 * Create a new Player Board with length initiate by constant.	
	 */
	public PlayerBoard(){
		this.board=new PlayableCard[BOARD_COL_LENGTH];
	}	
	/**
	 * Check if the slot of the board is empty
	 * @param column of the board
	 * @return boolean
	 */
	public boolean isEmpty(int col){
		return (this.board[col] == null);
	}	
	/**
	 * Place a card into the player's specified board slot
	 * @param card to place
	 */
	public void placeCard(PlayableCard card){
		if(this.indexNextCard>=BOARD_COL_LENGTH)
			System.out.println("Impossible de placer une carte, taille maximum du board atteinte");
		else
			this.board[this.indexNextCard]=card;
			this.indexNextCard++;
	}
	/**
	 * Destroy the card present in the specified slot
	 * @param column of the board where the card is present
	 */
	public void destroyCard(int col){
		this.board[col]=null;
	}	
	/**
	 * Return a random card from the board
	 * @return card
	 */
	public PlayableCard getRandomCard(){
		Random rng = new Random();
		int i=rng.nextInt(this.board.length+1);
		return this.board[i];		
	}
	/**
	 * Check if the card is the same
	 * @param col
	 * @param card
	 * @return boolean
	 */	
	public boolean checkCard(int col,PlayableCard card){
		return (this.board[col]==card);
	}	
	/*public void checkBoard(String action){
		for (int i=0; i<BOARD_COL_LENGTH; i++){
			for (int j=0; j<BOARD_ROW_LENGTH; j++){
				this.board[i][j].checkEffect(action);
			}
		}
	}*/
}
