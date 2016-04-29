
public class GameBoard
{
	private PlayerBoard firstPlayerBoard;
	private PlayerBoard secondPlayerBoard;
	
	public GameBoard(PlayerBoard fplayerboard , PlayerBoard splayervoard){
		this.firstPlayerBoard=fplayerboard;
		this.secondPlayerBoard=splayervoard;
	}

	public PlayerBoard getFirstPlayerBoard()
	{
		return firstPlayerBoard;
	}

	public void setFirstPlayerBoard(PlayerBoard firstPlayerBoard)
	{
		this.firstPlayerBoard = firstPlayerBoard;
	}

	public PlayerBoard getSecondPlayerBoard()
	{
		return secondPlayerBoard;
	}

	public void setSecondPlayerBoard(PlayerBoard secondPlayerBoard)
	{
		this.secondPlayerBoard = secondPlayerBoard;
	}
	
}
