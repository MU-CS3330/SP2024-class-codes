package hw5.pizza.order;

import java.util.ArrayList;
import java.util.List;

import hw5.pizza.AbstractPizza;
import hw5.pizza.PizzaCookingFactory;
import hw5.pizza.PizzaType;
import hw5.pizza.Toppings;
import hw5.pizza.cooking.BrickOvenCookingStrategy;
import hw5.pizza.cooking.ConventionalOvenCookingStrategy;
import hw5.pizza.cooking.CookingStyleType;
import hw5.pizza.cooking.ICookingStrategy;
import hw5.pizza.cooking.MicrowaveCookingStrategy;

public class PizzaOrder {

	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;

	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory();
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}

	public void printListOfToppingsByPizzaOrderID(int orderID) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(pizza != null) {
			System.out.println("Toppings:");
			for(Toppings topping : pizza.getToppingList()) {
				System.out.println("\t" + topping);
			}
		}
	}

	public void printPizzaOrderCart() {
		for(AbstractPizza pizza : pizzaOrderList) {
			System.out.println("Pizza: " + pizza);
		}
	}

	public AbstractPizza getPizzaByOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID)
				return pizza;
		}
		return null;
	}

	public boolean addPizzaToCart(PizzaType pizzaType) {
		return pizzaOrderList.add(pizzaFactory.createPizza(pizzaType));
	}

	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(!pizza.getToppingList().contains(topping)) {
			pizza.getToppingList().add(topping);
			pizza.updatePizzaPrice();
			return true;
		}
		// Topping already added
		return false;
	}

	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		if(pizza.getToppingList().contains(topping)) {
			pizza.getToppingList().remove(topping);
			pizza.updatePizzaPrice();
			return true;
		}
		// Topping is already removed
		return false;
	}

	public double checkout() throws Exception {
		double totalCartPrice = 0.0;
		if(isThereAnyUncookedPizza()) {
			throw new Exception();
		}
		for(AbstractPizza pizza : pizzaOrderList) {
			totalCartPrice += pizza.getTotalPrice();
		}
		return totalCartPrice;
	}

	public boolean isThereAnyUncookedPizza() {
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getCookingStrategy() == null) {
				return true;
			}
		}
		return false;
	}

	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		AbstractPizza pizza = null;
		switch (cookingStrategyType) {
		case BRICK_OVEN:
			cookingStrategy = new BrickOvenCookingStrategy();
			pizza = getPizzaByOrderID(orderID);
			cookingStrategy.cook(pizza);
			return true;
		case CONVENTIONAL_OVEN:
			cookingStrategy = new ConventionalOvenCookingStrategy();
			cookingStrategy.cook(getPizzaByOrderID(orderID));
			return true;
		case MICROWAVE:
			cookingStrategy = new MicrowaveCookingStrategy();
			cookingStrategy.cook(getPizzaByOrderID(orderID));
			return true;
		default:
			return false;
//			throw new IllegalArgumentException("Unexpected value: " + cookingStrategy);
		}
	}

}
