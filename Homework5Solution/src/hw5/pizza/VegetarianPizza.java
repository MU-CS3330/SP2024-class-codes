package hw5.pizza;

public class VegetarianPizza extends AbstractPizza {

	public VegetarianPizza() {
		this.priceWithoutToppings = 1.50;
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.BELL_PEPPER);
		this.toppingList.add(Toppings.BLACK_OLIVE);
		this.toppingList.add(Toppings.MUSHROOM);
		this.totalPrice = addTopingsToPrice(priceWithoutToppings);
	}

	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + "]";
	}
	
}
