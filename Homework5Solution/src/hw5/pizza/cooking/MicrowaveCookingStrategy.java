package hw5.pizza.cooking;

import hw5.pizza.AbstractPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy {

	private final static double microwaveOvenCookingPrice = 1.0;
	
	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza != null) {
			pizza.setCookingPrice(microwaveOvenCookingPrice);
			pizza.setCookingStrategy(this);
			pizza.updatePizzaPrice();
			return true;
		}
		return false;
	}
}
