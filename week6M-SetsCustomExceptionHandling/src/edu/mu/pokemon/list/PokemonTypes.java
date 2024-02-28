package edu.mu.pokemon.list;

public enum PokemonTypes {
	/*
	 *  You can assign values to enums, but you will
	 *  need a constructor.
	 */
	FIRE(1),
	WATER(2),
	GRASS(3);
	
	private int typeID;
	
	/*
	 * Depending on what values you are assigning to an
	 * enum, you need to have a corresponding constructor.
	 */
	private PokemonTypes(int i) {
		this.setTypeID(i);
	}

	/*
	 * You can also implement methods for enums to acquire
	 * and even change their values.
	 */
	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
}
