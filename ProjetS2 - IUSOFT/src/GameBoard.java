
public class GameBoard
{
	private PlayerBoard firstPlayerBoard;
	private PlayerBoard secondPlayerBoard;
	
	public GameBoard(PlayerBoard fpb , PlayerBoard spb){
		this.firstPlayerBoard=fpb;
		this.secondPlayerBoard=spb;
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
