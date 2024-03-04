package edu.mu.coinFactory.coins;

public class PennyCoin extends Coin {

	// We don't want the description to change and we can access it without instantiation
	private final static String DESCRIPTION = "This is a Penny!";
	
	// Initialize the type and value by default constructor
	public PennyCoin() {
		value = 0.01;
		type = CoinType.PENNY;
	}

	@Override
	public void getDescription() {
		System.out.println(DESCRIPTION);	
	}
}
