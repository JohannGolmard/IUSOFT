
public class Power extends PlayableCard{
	/**
	 * constructor of a power card
	 * @param soulCost
	 * @param neededSanity
	 * @param neededResistance
	 * @param neededIntelligence
	 * @param type
	 */
	public Power(int soulCost, int neededSanity, int neededResistance, int neededIntelligence, String trigger, String type) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence,trigger, type);
	}
}
