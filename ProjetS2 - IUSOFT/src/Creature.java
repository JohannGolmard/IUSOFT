
public abstract class Creature extends PlayableCard{
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
	protected Creature(int soulCost, int neededSanity, int neededResistance, int neededIntelligence, int health, int attack, int defense, String trigger, String type) {

		super(soulCost, neededSanity, neededResistance, neededIntelligence, trigger, type);
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
	/**
	 * represent the effect of the domain of the creature
	 */
	public abstract void domainEffect();
	/**
	 * represent the type of the creature's effect
	 */
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
