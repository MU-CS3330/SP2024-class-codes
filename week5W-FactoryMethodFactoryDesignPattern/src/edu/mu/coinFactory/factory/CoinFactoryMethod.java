package edu.mu.coinFactory.factory;

import edu.mu.coinFactory.coins.Coin;
import edu.mu.coinFactory.coins.DimeCoin;
import edu.mu.coinFactory.coins.NickleCoin;
import edu.mu.coinFactory.coins.PennyCoin;
import edu.mu.coinFactory.coins.QuarterCoin;

public class CoinFactoryMethod {
	
	public CoinFactoryMethod() {}
	
	/**
	 * Create a Penny coin
	 * @return
	 */
	public Coin createPennyCoin() {
		return new PennyCoin();
	}
	
	/**
	 * Create a Nickle coin
	 * @return
	 */
	public Coin createNickleCoin() {
		return new NickleCoin();
	}
	
	/**
	 * Create a Dime coin
	 * @return
	 */
	public Coin createDimeCoin() {
		return new DimeCoin();
	}
	
	/**
	 * Create a Quater coin
	 * @return
	 */
	public Coin createQuarterCoin() {
		return new QuarterCoin();
	}
}
