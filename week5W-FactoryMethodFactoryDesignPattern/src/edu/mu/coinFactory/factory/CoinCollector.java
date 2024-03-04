package edu.mu.coinFactory.factory;

import java.util.ArrayList;
import java.util.List;

import edu.mu.coinFactory.coins.Coin;

public class CoinCollector {

	private List<Coin> coinCollection;

	public CoinCollector(List<Coin> coinCollection) {
		this.coinCollection = coinCollection;
	}

	public CoinCollector() {
		this.coinCollection = new ArrayList<Coin>();
	}

	public List<Coin> getCoinCollection() {
		return coinCollection;
	}

	public void setCoinCollection(List<Coin> coinCollection) {
		this.coinCollection = coinCollection;
	}

	/**
	 * Calculates the total value of the coin collection
	 * @return
	 */
	public double totalValueOfCollection() {
		double totalValue = 0;
		for(Coin coin : coinCollection) {
			totalValue += coin.getValue();
		}
		return totalValue;
	}

	/**
	 * Counts the number of coins based on a given coin type.
	 * @param clazz
	 * @return
	 */
	public int getNumberOfCoinsByType(Class<?> clazz) {
		int count = 0;
		for(Coin c : coinCollection) {
			if(clazz == c.getClass()) {
				count++;
			}
		}
		return count;
	}
}
