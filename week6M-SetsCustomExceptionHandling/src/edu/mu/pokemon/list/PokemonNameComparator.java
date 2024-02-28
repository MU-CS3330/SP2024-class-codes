package edu.mu.pokemon.list;

import java.util.Comparator;

/**
 * Implementing the Comparator interface to have another option
 * to sort items using Collections.sort().
 * 
 * However, if you are using Comparator, then you want to use the
 * sort method with the Comparator argument.
 */
public class PokemonNameComparator implements Comparator<Pokemon> {

	/**
	 * Very similar to compareTo from Comparable.
	 * 
	 * However, it accepts two arguments. The sorting order
	 * works the same as in the Comparable example.
	 */
	@Override
	public int compare(Pokemon o1, Pokemon o2) {
//		return Integer.compare(o2.getName().length(), o1.getName().length());
		return o2.getName().compareTo(o1.getName());
	}

}
