package edu.mu.dragons.characters;

import edu.mu.dragons.dragonSlayingStrategy.IDragonSlayingStrategy;

public class DragonSlayer {
	
	private IDragonSlayingStrategy strategy;
	private String name;
	
	public DragonSlayer(String name) {
		this.setName(name);
	}
	
	public void changeStrategy(IDragonSlayingStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * After the attack is performed, if the dragon's HP is
	 * 0 or below, then that means the dragon slayer slew the
	 * dragon and returns true. Otherwise it returns false.
	 * @param dragon
	 * @return
	 */
	public boolean attack(Dragon dragon) {
		strategy.execute(dragon);
		if(dragon.getHP() <= 0) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
