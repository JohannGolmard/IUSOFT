
public class Power extends PlayableCard{
	
	private final String category;
	
	/**
	 * constructor of a power card
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 * @param type
	 */
	public Power(int soulCost, int neededSanity, int neededResistance, int neededIntelligence, String trigger, String type, String category) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence,trigger, type);
		this.category=category;
	}
	
	
}
