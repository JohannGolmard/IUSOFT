import java.util.Random;

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
	private Summoner sum1,sum2;
	
	public BunkaGamu(Summoner s1,Summoner s2){
		
		this.sum1=s1;
		this.sum2=s2;
		this.board = new GameBoard(s1, s2);
	}

	/**
	 * while(the game isn't finish)
	 *	 The player who start receive one card from is deck 
	 * 	 Then the player choose is action :
	 *  	-case The summoner summon a creature while the summoner has the specified condition to invoke it 
	 * 		-case Equip one of his creature on his board with a equipment from his hand
	 * 		-case Attack , the player use one of his creature to Attack the enemy
	 *  	by default the only choice possible is to finish his turn
	 *  
	 * if the player choose to finish his turn
	 * 		then the other player receive one card from is deck
	 * 		 and the switch restart
	 * 
	 * 	A summoner has 2 minutes to play before the turn finish itself to let the other summoner play.
	 *  
	 *  the winner is the first summoner to down the summoner enemy at 0 life point
	 */
	public void play(){

		while(!this.isFinish()){
			if(!this.sum1.getPlayerDeck().isEmpty())
				this.sum1.getHand().addCard(this.sum1.getPlayerDeck().draw());
			
			switch(Choice.getRandomChoice())
			{

			case takeCard:
				this.sum1.takeCard((sum1.getRandomCard()));
				break;
			case attackWithMonster:
				PlayableCard a=this.sum1.getBoard().getRandomCard();
				Random rng = new Random();
				int c = rng.nextInt(2);
				if(c==0){
					PlayableCard v=this.sum2.getBoard().getRandomCard();
					this.sum1.attackWithMonster(v,a);
					if(((Creature) v).getHealth()==0){
						for(int i=0;i<5;i++){
							if(this.sum2.getBoard().checkCard(i, v))
								this.sum2.getBoard().destroyCard(i);						
							i++;
						}
					}
				}
				
				if(c==1)
					this.sum2.setHealth(this.sum2.getHealth()-((Creature) a).getAttack());
				
					
				break;
			default:
				System.out.println("\nFin du tour du joueur 1\n");
			}
			
			if(!this.sum1.getPlayerDeck().isEmpty())			
				this.sum2.getHand().addCard(this.sum1.getPlayerDeck().draw());
			
			switch(Choice.getRandomChoice())
			{
			case takeCard:
				this.sum1.takeCard((sum2.getRandomCard()));
				break;
			case attackWithMonster:
				PlayableCard a=this.sum2.getBoard().getRandomCard();
				Random rng = new Random();
				int c = rng.nextInt(2);
				if(c==0){
					PlayableCard v=this.sum1.getBoard().getRandomCard();
					this.sum1.attackWithMonster(v,a);
					if(((Creature) v).getHealth()==0){
						for(int i=0;i<5;i++){
							if(this.sum1.getBoard().checkCard(i, v))
								this.sum1.getBoard().destroyCard(i);												
							i++;
						}
					}
				}
				if(c==1)
					this.sum1.setHealth(this.sum1.getHealth()-((Creature)a).getAttack());
				break;
			default:
				System.out.println("\nFin du tour du joueur 2\n");
			}		
			
		System.out.println("Joueur 1 :"+this.sum1.getHealth());
		System.out.println("Joueur 2 :"+this.sum2.getHealth());
		}
	}
	/**
	 * check if the game is finish
	 * @return boolean
	 */
	public boolean isFinish(){
		if(this.sum1.getHealth() <= 0){
			System.out.println("Le joueur 2 a gagn�");
			return true;}
		if(this.sum2.getHealth() <= 0){
			System.out.println("Le joueur 1 a gagn�");
			return true;}
		return false;
	}
	/**
	 * Use to generate a random choice for player
	 *
	 */
	enum Choice{
	takeCard,
	summonMonster,
	attackWithMonster;
	
	private static final Choice[] VALUES = values();
	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();
	
	public static Choice getRandomChoice(){
		return VALUES[RANDOM.nextInt(SIZE)];
	}
	}

}
