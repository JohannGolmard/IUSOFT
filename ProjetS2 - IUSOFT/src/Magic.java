public class Magic extends Creature {
	
	protected Magic(int soulCost, int health, int attack, String type) {
		super(soulCost, health,	attack, type);
	}
	public String toString(){
		return "Carte Magique avec "+this.getSoulCost()+" points necéssaire, "+this.getAttack()+" Attaque et "+this.getHealth()+" points de vie";
	}
}