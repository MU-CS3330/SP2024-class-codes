package edu.mu.coinFactory.coins;

public abstract class Coin {

	protected double value;
	protected CoinType type;
	
	public CoinType getType() {
		return type;
	}

	public void setType(CoinType type) {
		this.type = type;
	}

	// implementing different descriptions for each subclass
	public abstract void getDescription();

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
