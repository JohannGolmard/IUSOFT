
public class Power extends PlayCard{
	/**
	 * constructor of a power card
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 * @param type
	 */
	public Power(int soulCost, int neededSanity, int neededResistance,
			int neededIntelligence, String type) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence);
		this.type=type;
	}
	/**
	 * the type of the power
	 */
	private String type;

	/**
	 * returns the type of the power
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * set the type of the power
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
