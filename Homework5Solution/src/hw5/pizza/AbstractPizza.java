package hw5.pizza;

import java.util.ArrayList;
import java.util.List;

import hw5.pizza.cooking.ICookingStrategy;

public abstract class AbstractPizza {
	
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int oderIDCounter = 0;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice = 0.0;
	
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	public AbstractPizza() {
		toppingList = new ArrayList<Toppings>();
	}
	
	protected double addTopingsToPrice(double priceWithoutToppings) {
		double priceWithToppings = priceWithoutToppings;
		for(Toppings topping : toppingList) {
			priceWithToppings += topping.getToppingPrice();
		}
		return priceWithToppings;
	}
	
	public double updatePizzaPrice() {
		double updatedPrice = priceWithoutToppings;
		for(Toppings topping : toppingList) {
			updatedPrice += topping.getToppingPrice();
		}
		updatedPrice += cookingPrice;
		this.totalPrice = updatedPrice;
		return updatedPrice;
	}
	
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	
}
