package edu.mu.pokemon.list;

import java.util.Objects;


/**
 * Implementing Comparable interface to be able to use
 * the Collections framework methods such as; sort().
 * 
 * Implementing the Comparable interface will force you
 * to implement the compareTo() method. Where you get to 
 * define how your Pokemon objects should be compared.
 */
public class Pokemon implements Comparable<Pokemon> {
	
	private PokemonTypes type;
	private String name;
	
	public Pokemon(PokemonTypes type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public PokemonTypes getType() {
		return type;
	}

	public void setType(PokemonTypes type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pokemon [type=" + type + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		Pokemon p = (Pokemon)obj;
		if(this.getName().equals(p.getName()) && 
				this.getType() == p.getType()) {
			return true;
		}
		return false;
	}
	
	/**
	 * If you are using a Set data structure, implementing
	 * the equals method will not be enough. You also have
	 * to implement the hashCode() method. To generate a hash
	 * value. Otherwise, you will still have duplicates in your
	 * set.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(name, type);
	}

	
	/**
	 * This method comes with the Comparable interface.
	 * If you change the order of the compared objects,
	 * you can change it from ascending to descending.
	 */
	@Override
	public int compareTo(Pokemon o) {
//		return Integer.compare(o.getType().getTypeID(), this.getType().getTypeID()); // compare by their type values
		return this.getName().compareTo(o.getName()); // compare them by their names
	}
}
