package edu.mu.pokemon.list;

/**
 * If you are implementing your custom exception, you need to 
 * make sure you are extending the Exception super class
 */
public class PokemonNotExistException extends Exception {
	
	/**
	 * This is a serialization, this allows you to have
	 * quicker access to data.
	 * 
	 * You can have this custom exception class without it but you 
	 * will have warnings. Therefore, the serialVersionUID is generated
	 * by the Eclipse IDE. Or you can generate a default one.
	 */
	private static final long serialVersionUID = 4578880502844507957L;

	/**
	 * The PokemonNotExistException constructor, when the selected 
	 * pokemon does not exist in the set
	 * @param msg
	 * @param p
	 */
	public PokemonNotExistException(String msg, Pokemon p) {
		System.out.println(msg + p.toString());
	}

}
