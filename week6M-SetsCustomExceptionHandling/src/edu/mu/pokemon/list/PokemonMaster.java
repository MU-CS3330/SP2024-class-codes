package edu.mu.pokemon.list;

import java.util.HashSet;
import java.util.Set;

public class PokemonMaster {
	
	private String name;
	private Set<Pokemon> pokemonSet;
	
	public Set<Pokemon> getPokemonSet() {
		return pokemonSet;
	}

	public void setPokemonSet(Set<Pokemon> pokemonSet) {
		this.pokemonSet = pokemonSet;
	}

	public PokemonMaster(String name) {
		this.setName(name);
		this.pokemonSet = new HashSet<Pokemon>();
	}
	
	public boolean addPokemonToStorage(Pokemon p) {
		if(p == null) {
			return false;
		}
//		if(pokemonSet.add(p)) {
//			System.out.println("Pokemon added to the set");
//		}
//		else {
//			System.out.println("You already have this pokemon");
//		}
//		return true;
		return pokemonSet.add(p); // add method already returns boolean
	}
	
	public Pokemon selectPokemon(Pokemon callPokemon) throws PokemonNotExistException {
		if(pokemonSet.contains(callPokemon)) {
			for(Pokemon pokemon : pokemonSet) {
				if(pokemon.equals(callPokemon)) {
					System.out.println("Go " + pokemon.getName() + " I choose you!!!");
					return pokemon;
				}
			}
		}
		// throw exception
		throw new PokemonNotExistException("Sorry you don't have this pokemon: ", callPokemon);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
