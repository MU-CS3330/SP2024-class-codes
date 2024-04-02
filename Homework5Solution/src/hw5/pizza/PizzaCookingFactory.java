package hw5.pizza;

public class PizzaCookingFactory {
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		AbstractPizza pizza = null;
		switch(pizzaType) {
			case HAWAIIAN:
				pizza = new HawaiianPizza();
				break;
			case MARGHERITA:
				pizza = new MargheritaPizza();
				break;
			case SUPREME:
				pizza = new SupremePizza();
				break;
			case VEGETERIAN:
				pizza = new VegetarianPizza();
				break;
			default:
				return null;
		}
		pizza.setPizzaOrderID(++AbstractPizza.oderIDCounter);
		return pizza;
	}
	
}
