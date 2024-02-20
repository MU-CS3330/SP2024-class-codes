package edu.mu.dragons.dragonSlayingStrategy;

import edu.mu.dragons.characters.Dragon;

public class SpellStrategy implements IDragonSlayingStrategy {

	private final int hitPoints = 5;
	
	@Override
	public void execute(Dragon dragon) {
		System.out.println("Shooting fairy dust!");
		int hp = dragon.getHP();
		dragon.setHP(hp - hitPoints);
	}
	
}
