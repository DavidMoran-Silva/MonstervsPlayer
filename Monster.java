
public class Monster extends Creature  {
	// unique attribute for Monster
	private int enrageThreshold;
	private boolean isEnraged = false;
	
	// inheriting parameters from Creature + enrageThreshold 
	public Monster(String name, String description, int hp, int dmg, int enrageThreshold, boolean isEnraged) {
		super(name, description, hp, dmg);
		this.enrageThreshold = enrageThreshold;
		this.isEnraged = false;
		}
	
	// enrage method / conditions
	public boolean canEnrage() {
		if(getHP() < this.enrageThreshold) {
			return true;
		}
		return false;
	}
	
	
	// enrage multiplier
	public void enrage() { 			
		if(!isEnraged)		
	{
		setDMG(getDMG() * 2);
		isEnraged = true;
		System.out.println("The " + getName() +  " has enraged");
	}

}
}