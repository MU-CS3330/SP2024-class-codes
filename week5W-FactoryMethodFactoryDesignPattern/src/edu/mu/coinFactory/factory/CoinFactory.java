package edu.mu.coinFactory.factory;

import edu.mu.coinFactory.coins.Coin;
import edu.mu.coinFactory.coins.CoinType;
import edu.mu.coinFactory.coins.DimeCoin;
import edu.mu.coinFactory.coins.NickleCoin;
import edu.mu.coinFactory.coins.PennyCoin;
import edu.mu.coinFactory.coins.QuarterCoin;

public class CoinFactory {

	public CoinFactory() {
	}

	/**
	 * Method for the Factory design pattern.
	 * The method accepts a coin type, and based on the
	 * type it generates the corresponding coin type.
	 * @param type
	 * @return
	 */
	public Coin createCoin(CoinType type) {
		switch(type) {
			case PENNY:
				return new PennyCoin();
			case NICKLE:
				return new NickleCoin();
			case DIME:
				return new DimeCoin();
			case QUARTER:
				return new QuarterCoin();
			default:
				System.out.println("Invalid coin");
				break;
		}
		return null;
	}

}
