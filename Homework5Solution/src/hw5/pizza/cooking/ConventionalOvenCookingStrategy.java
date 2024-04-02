package hw5.pizza.cooking;

import hw5.pizza.AbstractPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy {

	private final static double conventionalOvenCookingPrice = 8.0;
	
	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza != null) {
			pizza.setCookingPrice(conventionalOvenCookingPrice);
			pizza.setCookingStrategy(this);
			pizza.updatePizzaPrice();
			return true;
		}
		return false;
	}

}
