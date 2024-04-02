package hw5.pizza.cooking;

import hw5.pizza.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy {

	private final static double brickOvenCookingPrice = 10.0;
	
	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza != null) {
			pizza.setCookingPrice(brickOvenCookingPrice);
			pizza.setCookingStrategy(this);
			pizza.updatePizzaPrice();
			return true;
		}
		return false;
	}
}
