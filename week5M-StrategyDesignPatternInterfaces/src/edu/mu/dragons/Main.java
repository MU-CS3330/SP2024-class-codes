package edu.mu.dragons;

import edu.mu.dragons.characters.Dragon;
import edu.mu.dragons.characters.DragonSlayer;
import edu.mu.dragons.characters.DragonType;
import edu.mu.dragons.dragonSlayingStrategy.ArcheryStrategy;
import edu.mu.dragons.dragonSlayingStrategy.SpellStrategy;
import edu.mu.dragons.dragonSlayingStrategy.SwordStrategy;

public class Main {

	public static void main(String[] args) {
//		Dragon dragon = new Dragon(50, "Green Dragon");
		Dragon dragon = new Dragon(50, "Robert", DragonType.SILVER_DRAGON);
		
		DragonSlayer alasdair = new DragonSlayer("Alasdair");
		alasdair.changeStrategy(new ArcheryStrategy());
		alasdair.attack(dragon);
		alasdair.attack(dragon);
		alasdair.attack(dragon);
		alasdair.changeStrategy(new SpellStrategy());
		alasdair.attack(dragon);
		alasdair.changeStrategy(new SwordStrategy());
		alasdair.attack(dragon);
		System.out.println("Dragon HP: " + dragon.getHP());
		
		
	}

}
