
public class TreasureRoom extends Room{
private String treasure;
	
	public TreasureRoom (int roomIndex, String description, Monster monster, String treasure) {
		super(roomIndex, description, monster);
		this.treasure = treasure;
	}
	
	public void enter(Player player) {
		// if monster is alive when player enters
		if (getMonster().isAlive()) {
			System.out.println(player.getName() + " This Room is " + this.getDescription() + " and has " + getMonster().getName());	
		}
		// if monster is dead
		else {
			System.out.print("You explored the room and found the hidden treasure! " + this.treasure);
		}
	
		
	}

}
