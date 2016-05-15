
public class creature extends CardToPlay{
	/**
	 * the health of the creature
	 */
	private int health;
	/**
	 * the defrense of the creature
	 */
	private int defense;
	/**
	 * the attack of the creature
	 */
	private int attack;
	
	public void domainEffect(){
		//TODO write code
		
	}
	
	public void typeEffect(){
		// TODO write code
		
	}
	/** 
	 * returns the life points of the creature
	 * @return health
	 */
	public int getHealth() {
		return health;
	}
	/** 
	 * set the life points of the creature
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/** 
	 * returns the defense points of the creature
	 * @return defense
	 */
	public int getDefense() {
		return defense;
	}
	/** 
	 * set the defense points of the creature
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/** 
	 * returns the attack points of the creature
	 * @return attack
	 */
	public int getAttack() {
		return attack;
	}
	/** 
	 * set the attack points of the creature
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	

}
