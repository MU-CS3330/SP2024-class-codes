package edu.mu.dragons.dragonSlayingStrategy;

import edu.mu.dragons.characters.Dragon;
import edu.mu.dragons.characters.DragonType;

public class SwordStrategy implements IDragonSlayingStrategy {


	private final int hitPoints = 25;
	
	/**
	 * Sword strategy gets a 50% boost attack against 
	 * Silver type dragon.
	 */
	@Override
	public void execute(Dragon dragon) {
		int hp = dragon.getHP();
		if(dragon.getDragonType() == DragonType.SILVER_DRAGON) {
			double damage = hitPoints * 1.5;
			System.out.println("Sword was effective on Silver Dragon!");
			dragon.setHP(hp - (int)damage);
		}
		else {
			System.out.println("Swinging my excalibur!");
			dragon.setHP(hp - hitPoints);
		}
	}
}
