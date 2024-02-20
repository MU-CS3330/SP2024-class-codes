package edu.mu.dragons.dragonSlayingStrategy;

import edu.mu.dragons.characters.Dragon;

public interface IDragonSlayingStrategy {

	/**
	 * The method to initiate the dragon slaying
	 * strategy on the given dragon.
	 * @param dragon
	 */
	public void execute(Dragon dragon);

}
