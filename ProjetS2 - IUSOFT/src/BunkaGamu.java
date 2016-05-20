/**
 * This class represents a BunkaGamu game ready to play. The game is constitute of two player fighting against each other
 * They fight with deck of cards. Each card can be a specific type with a cost type for the player to use it/ invoke it.
 * The players have a limited amount of life point , and if one of them reach 0 , he loses the game. A player can be attack by the
 * creature of the player enemy , a card that use a spell , a trap card. The player can only play on his turn. Each turn have a counter of 2 minutes
 * before it finish itself.
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
	 * while(the game isn't finish)
	 *	 The player who start receive one card from is deck 
	 * 	 Then the player choose is action :
	 *  	-case skill of summoner
	 *  	-case summon creature while the summoner has the specified condition to invoke it 
	 *  	-case Use a spell from his hand
	 * 		-case Equip one of his creature on his board with a equipment from his hand
	 * 		-case Attack , the player use one of his creature to Attack the enemy
	 *  	-case Play a card , the summoner put a trap card on his board, which can't be activate on the same turn of the summoner who play it.
	 *  	by default the only choice possible is to finish his turn
	 *  
	 * if the player choose ton finish his turn
	 * 		then the other player receive one card from is deck
	 * 		 and the switch restart
	 * else
	 * 		he has 2 minutes to play before the turn finish itself to let the other summoner play.
	 *  
	 *  the winner is the first summoner to down the summoner enemy at 0 life point
	 */
	public void play(){
		while(this.board.isFinish()){
			this.board.getFirstPlayerBoard().getSummoner().getPlayerDeck().draw();
			switch()
			{
			case this.board.getFirstPlayerBoard().getSummoner().exercise("a skill"):
				
				break;
			case this.board.getFirstPlayerBoard().getSummoner().summonMonster():
				
				break;
			case this.board.getFirstPlayerBoard().getSummoner().useSpell():
				
				break;
			case this.board.getFirstPlayerBoard().getSummoner().equipMonster():
				
				break;
			case this.board.getFirstPlayerBoard().getSummoner().attackWithMonster():
				
				break;
			case this.board.getFirstPlayerBoard().getSummoner().useTrapCard():
				
				break;
			default:
				//finish turn
					
			}
			
			
			
		}
		
	}	
}
