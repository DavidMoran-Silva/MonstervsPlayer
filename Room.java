
public class Room {
	private int roomIndex;
	private String description;
	
	// new monster object
	private Monster monster;
	
	// room constructor/info
	public Room(int roomIndex, String description, Monster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster;
	}
	
	public boolean isComplete() {
		if (monster.isAlive())
		return false;
		return true;
		}
	

	
	// room name, monster inside, battle start
	public void enter(Player player) {
		if (monster.isAlive()) {
		System.out.println(player.getName() + ", this room is " + this.description + " and has an " + monster.getName());
		}
	}
	
	// getters
	public int getRoomIndex() {
		return this.roomIndex;
	}
	public String getDescription() {
		return this.description;
	}
	public Monster getMonster() {
		return this.monster;
	}
	
	// setters
	public void setRoomIndex(int roomIndex) {
		this.roomIndex = roomIndex;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	@Override
	public String toString() {
		return String.format("roomIndex %5d, description %20s, monster %10s", roomIndex, description, monster.getName());
	}
}
