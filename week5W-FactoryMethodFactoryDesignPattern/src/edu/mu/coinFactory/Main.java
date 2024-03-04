package edu.mu.coinFactory;

import edu.mu.coinFactory.coins.Coin;
import edu.mu.coinFactory.coins.CoinType;
import edu.mu.coinFactory.coins.DimeCoin;
import edu.mu.coinFactory.factory.CoinCollector;
import edu.mu.coinFactory.factory.CoinFactory;
import edu.mu.coinFactory.factory.CoinFactoryMethod;

public class Main {

	public static void main(String[] args) {
		CoinCollector collectorUsingFactoryMethodDP = new CoinCollector();
		CoinCollector collectorFactoryDP = new CoinCollector();
		
		// Using Factory-method design pattern
		CoinFactoryMethod factoryMethod = new CoinFactoryMethod();
		collectorUsingFactoryMethodDP.getCoinCollection().add(factoryMethod.createDimeCoin());
		collectorUsingFactoryMethodDP.getCoinCollection().add(factoryMethod.createDimeCoin());
		collectorUsingFactoryMethodDP.getCoinCollection().add(factoryMethod.createQuarterCoin());
		collectorUsingFactoryMethodDP.getCoinCollection().add(factoryMethod.createPennyCoin());
		
		// Using an ordinary Factory design pattern
		CoinFactory factory = new CoinFactory();
		collectorFactoryDP.getCoinCollection().add(factory.createCoin(CoinType.DIME));
		collectorFactoryDP.getCoinCollection().add(factory.createCoin(CoinType.DIME));
		collectorFactoryDP.getCoinCollection().add(factory.createCoin(CoinType.QUARTER));
		collectorFactoryDP.getCoinCollection().add(factory.createCoin(CoinType.PENNY));
		
		
		System.out.println("Total money made: " + collectorFactoryDP.totalValueOfCollection());
		
		// Testing the George Washington coin with a method from enum class.
		for(Coin coin : collectorFactoryDP.getCoinCollection()) {
			if(!coin.getType().isGeorgeWashingtonCoin()) {
				System.out.println("This is not a Quarter coin!");
			}	
		}
		
		System.out.println(collectorFactoryDP.getNumberOfCoinsByType(DimeCoin.class));
	}
}
