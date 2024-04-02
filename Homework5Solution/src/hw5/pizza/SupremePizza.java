package hw5.pizza;

public class SupremePizza extends AbstractPizza {

	public SupremePizza() {
		this.priceWithoutToppings = 3.50;
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.BELL_PEPPER);
		this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		this.toppingList.add(Toppings.PEPPERONI);
		this.toppingList.add(Toppings.BLACK_OLIVE);
		this.toppingList.add(Toppings.MUSHROOM);
		this.totalPrice = addTopingsToPrice(priceWithoutToppings);
	}

	@Override
	public String toString() {
		return "SupremePizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + "]";
	}
	
}
