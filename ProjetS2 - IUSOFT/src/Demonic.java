public  abstract class Demonic extends Creature {
	
	protected Demonic(int soulCost, int neededSanity, int neededResistance, int neededIntelligence, int health, int attack, int defense, String trigger) {

		super(soulCost, neededSanity, neededResistance, neededIntelligence, health,	attack, defense, trigger);
		
	}

	public void domainEffect(){
	}
	
	public void typeEffect(){	
	}
}