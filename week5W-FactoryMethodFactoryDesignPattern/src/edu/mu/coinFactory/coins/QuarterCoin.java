package edu.mu.coinFactory.coins;

public class QuarterCoin extends Coin {
		
	// We don't want the description to change and we can access it without instantiation
	private final static String DESCRIPTION = "This is a Quarter!";

	// Initialize the type and value by default constructor
	public QuarterCoin() {
		value = 0.25;
		type = CoinType.QUARTER;
	}

	@Override
	public void getDescription() {
		System.out.println(DESCRIPTION);
	}
}
