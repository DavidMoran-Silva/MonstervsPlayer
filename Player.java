
public class Player extends Creature{

	// unique attribute for Player
		private int healAmount;
		
		// player class inherits the values from the Creature class through the super command with healAmount added for the player class
		public Player(String name, String description, int hp, int dmg, int healAmount) {
			super(name, description, hp, dmg);
			this.healAmount = healAmount;
		}
		// method to increase player hp by healAmount
		public void heal() {
			setHP(healAmount);
		}
}
