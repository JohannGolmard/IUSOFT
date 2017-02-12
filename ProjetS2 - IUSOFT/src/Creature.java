
public abstract class Creature extends PlayableCard{
	/**
	 * create a creature card
	 * @param soulCost
	 * @param health
	 * @param attack
	 */
	protected Creature(int soulCost, int health, int attack, String type) {

		super(soulCost, type);
		this.health= health;
		this.attack= attack;
	}
	/**
	 * the health of the creature
	 */
	private int health;
	/**
	 * the attack of the creature
	 */
	private int attack;
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
