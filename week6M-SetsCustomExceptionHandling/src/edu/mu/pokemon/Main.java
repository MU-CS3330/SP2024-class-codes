package edu.mu.pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import edu.mu.pokemon.list.Pokemon;
import edu.mu.pokemon.list.PokemonMaster;
import edu.mu.pokemon.list.PokemonNameComparator;
import edu.mu.pokemon.list.PokemonNotExistException;
import edu.mu.pokemon.list.PokemonTypes;

public class Main {

	public static void main(String[] args) {
		/*
		 * Sets shouldn't have duplicates
		 */
//		Set<Integer> intSet = new HashSet<Integer>();
//		intSet.add(5);
//		System.out.println("Size of Set: " + intSet.size());
//		intSet.add(7);
//		System.out.println("Size of Set: " + intSet.size());
//		intSet.add(5);
//		System.out.println("Size of Set: " + intSet.size());
		
		
		PokemonMaster master = new PokemonMaster("Zoe");
		master.addPokemonToStorage(new Pokemon(PokemonTypes.FIRE, "Charizard"));
		System.out.println("Zoe has " + master.getPokemonSet().size() + " pokemons");
		master.addPokemonToStorage(new Pokemon(PokemonTypes.FIRE, "Charizard"));
		master.addPokemonToStorage(new Pokemon(PokemonTypes.WATER, "Squirtle"));
		master.addPokemonToStorage(new Pokemon(PokemonTypes.GRASS, "Bulbasaur"));
		master.addPokemonToStorage(new Pokemon(PokemonTypes.WATER, "Magikarp"));
		System.out.println("Zoe has " + master.getPokemonSet().size() + " pokemons");
		
		// Option 1: copying set into a List
//		List<Pokemon> pokemonList = new ArrayList<Pokemon>(master.getPokemonSet());
		
		// Option 2: copying set into a List by adding all the items.
		List<Pokemon> pokemonList = new ArrayList<Pokemon>();
		pokemonList.addAll(master.getPokemonSet());
		
		// sort using comparable
		Collections.sort(pokemonList);
		
		// sort using comparator
//		Collections.sort(pokemonList, new PokemonNameComparator());
		
		for(Pokemon p : pokemonList) {
			System.out.println(p);
		}
		
		/*
		 * Trying to catch an exception based on a pokemon that does
		 * not exist in the pokemon master's set.
		 */
		try {
			master.selectPokemon(new Pokemon(PokemonTypes.FIRE, "Charmender"));
		} catch (PokemonNotExistException e) {
			e.printStackTrace();
		}
	}

}
