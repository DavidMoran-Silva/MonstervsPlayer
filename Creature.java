
public class Creature {
	 private String name;
	 private String description;
	 private int hp;
	 private int dmg;
//	 private Room room;
	
	// default values for constructor
	public Creature() {
		name = "";
		description = "";
		hp = 0;
		dmg = 0;
//		room = null;
	}
	
	// original constructor for all being classes
	public Creature(String name, String description, int hp, int dmg){
		this.name = name;
		this.description = description;
		this.hp = hp;
		this.dmg = dmg;
//		this.room = null;
	}
	
	// battle log 
	public void attack (Creature creature) {
		System.out.println(this.name + " attacks " + creature + ", dealing " + dmg + " damage.");	
	}
	
	// determines if player/monster is dead
	public boolean isAlive() {
		return hp > 0;
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public int getHP() {
		if (this.hp < 0) {
		 return 0;
		}
		return this.hp;
	}
	public int getDMG() {
		return this.dmg;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.name = description;
	}
	// adding inputed int to current hp
	public void setHP(int hp) {
		this.hp += hp;
	}
	public void setDMG(int dmg) {
		this.dmg = dmg;		
	}
	
	
	// outcome of battle determining new hp for both player and creature
	public void takeDamage (int dmg) {
		hp -= dmg;	
		if (hp < 0) {
			hp = 0;
		}
		System.out.println(getName() + " has lost " + dmg + " health");
	}
}


