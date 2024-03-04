package edu.mu.coinFactory.coins;

public class DimeCoin extends Coin {

	// We don't want the description to change and we can access it without instantiation
	private final static String DESCRIPTION = "This is a Dime!";

	// Initialize the type and value by default constructor
	public DimeCoin() {
		value = 0.1;
		type = CoinType.DIME;
	}

	@Override
	public void getDescription() {
		System.out.println(DESCRIPTION);
	}
}
