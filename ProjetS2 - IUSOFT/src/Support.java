public class Support extends Martial{

	public Support(int soulCost, int neededSanity, int neededResistance,
			int neededIntelligence, int health, int attack, int defense) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence, health,
				attack, defense);

	}

	@Override
	public boolean checkEffect() {

		return false;
	}

}
