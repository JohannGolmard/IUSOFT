
public abstract class Creature extends PlayCard{
	/**
	 * create a creature card
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 * @param health
	 * @param attack
	 * @param defense
	 */
	public Creature(int soulCost, int neededSanity, int neededResistance,
			int neededIntelligence, int health, int attack, int defense) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence);
		this.health= health;
		this.attack= attack;
		this.defense=defense;
	}
	/**
	 * the health of the creature
	 */
	private int health;
	/**
	 * the defense of the creature
	 */
	private int defense;
	/**
	 * the attack of the creature
	 */
	private int attack;
	
	public abstract void domainEffect();
	
	public abstract void typeEffect();
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
