package edu.mu.coinFactory.coins;

public class NickleCoin extends Coin {

	// We don't want the description to change and we can access it without instantiation
	private final static String DESCRIPTION = "This is a Nickle!";
	
	// Initialize the type and value by default constructor
	public NickleCoin() {
		value = 0.05;
		type = CoinType.NICKLE;
	}
	
	@Override
	public void getDescription() {
		System.out.println(DESCRIPTION);
	}
}
