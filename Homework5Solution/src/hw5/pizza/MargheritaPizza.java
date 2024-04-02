package hw5.pizza;

public class MargheritaPizza extends AbstractPizza {
	
	public MargheritaPizza() {
		this.priceWithoutToppings = 2.50;
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.CHEESE);
		this.totalPrice = addTopingsToPrice(priceWithoutToppings);
	}

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + "]";
	}
}
