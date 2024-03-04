package edu.mu.coinFactory.coins;

public enum CoinType {
	PENNY,
	NICKLE,
	DIME,
	QUARTER;
	
	/**
	 * A method to test if the coin type is a Quarter.
	 * Returns <b>true</b> if it is a quarter coin, if 
	 * not it returns <b>false</b>.
	 * @return
	 */
	public boolean isGeorgeWashingtonCoin() {
		if(this == QUARTER) {
			System.out.println("This coin has a George Washington on it.");
			return true;
		}
		return false;
	}
}
