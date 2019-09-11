import java.util.Scanner;

public class Battle {
	Player player;
    Monster monster;
    Scanner scnr = new Scanner(System.in);
    String input;

    
    public Battle(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
        
    }
    
    public void run() {
    	System.out.println("A battle will Start " + player.getName() + " vs " + monster.getName());
		while(monster.isAlive() == true && player.isAlive() == true) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println(player.getName() + ": " + player.getHP() + " vs " + monster.getName() + ": " + monster.getHP());
            System.out.println(player.getName() + "'s turn.....");
            System.out.println("Would you like to Attack(a) or Heal(h) ");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            input = scnr.next();
               if(input.equals("a") || input.equals("A")) {
                   monster.takeDamage(player.getDMG());
                   
                  // player.getHP() -=monster.getHP();
                   
           		    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");   
        			System.out.println(monster.getName() + "'s turn....");
        			System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                  
                   if(monster.canEnrage()) {
                  	 monster.enrage();
                       player.takeDamage(monster.getDMG());
                   } 
                   else {
                       player.takeDamage(monster.getDMG());
                   }
                    
               
               }
              
               else if (input.equals("h") || input.equals("H")) {
                   player.heal();
               }

               else {
            	   
                   System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
               	   System.out.println("That's not a valid input");
                   System.out.println("||||||||||||||||||||||||||||||||||||||||||||");  
                  
                   }
             
              
                if(monster.isAlive() == false) {
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("Creature has DIED");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
                    
                } 
                else if (player.isAlive() == false) {
              	  // if player is dead print you lose
                 System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||"); 
              	  System.out.println("You've been DESTROYED");
                 System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                  
                } 
            
        }
	}
}
