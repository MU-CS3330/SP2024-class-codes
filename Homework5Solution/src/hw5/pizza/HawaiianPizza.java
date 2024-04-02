package hw5.pizza;

public class HawaiianPizza extends AbstractPizza {
	
	public HawaiianPizza() {
		this.priceWithoutToppings = 3.00;
		this.toppingList.add(Toppings.CANADIAN_BACON);
		this.toppingList.add(Toppings.CHEESE);
		this.toppingList.add(Toppings.PINEAPPLE);
		this.totalPrice = addTopingsToPrice(priceWithoutToppings);
	}

	@Override
	public String toString() {
		return "HawaiianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + "]";
	}
}
