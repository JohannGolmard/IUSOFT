public class Demonic extends Creature {
	
	protected Demonic(int soulCost, int health, int attack, String type) {
		super(soulCost, health,	attack, type);
	}
	public String toString(){
		return "Carte Démonique avec "+this.getSoulCost()+" points necéssaire, "+this.getAttack()+" Attaque et "+this.getHealth()+" points de vie";
	}
}