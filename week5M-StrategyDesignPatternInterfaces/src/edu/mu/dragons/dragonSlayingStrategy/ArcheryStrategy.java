package edu.mu.dragons.dragonSlayingStrategy;

import edu.mu.dragons.characters.Dragon;

public class ArcheryStrategy implements IDragonSlayingStrategy {

	private final int hitPoints = 2;
	
	/**
	 * The Archery strategy is ineffective against dragon
	 * with name Robert.
	 */
	@Override
	public void execute(Dragon dragon) {
		if(dragon.getName().equalsIgnoreCase("Robert")) {
			System.out.println("Dragon Slayer: OH NO, it's Robert! I am allergic to dragons with the name 'Robert'");
			System.out.println("Narrator: Our dragon slayer shoots their arrow anyways.");
			System.out.println("Robert the Dragon: Ha ha! That tickled!");
			System.out.println("Narrator: The arrows had no effect on the Dragon...");
		}
		else {
			System.out.println("Shoot lame arrows!");
			int hp = dragon.getHP();
			dragon.setHP(hp-hitPoints);
		}
	}
}
