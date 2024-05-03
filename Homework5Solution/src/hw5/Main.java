package hw5;

import hw5.pizza.PizzaType;
import hw5.pizza.Toppings;
import hw5.pizza.VegetarianPizza;
import hw5.pizza.cooking.CookingStyleType;
import hw5.pizza.order.PizzaOrder;

public class Main {

	public static void main(String[] args) {
		VegetarianPizza vp = new VegetarianPizza();
		System.out.println(vp.toString());
//		PizzaOrder order = new PizzaOrder();
//		
//		order.addPizzaToCart(PizzaType.HAWAIIAN);
//		order.printPizzaOrderCart();
//		System.out.println();
//		order.addPizzaToCart(PizzaType.MARGHERITA);
//		order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.BRICK_OVEN);
//		order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.MICROWAVE);
//		order.printPizzaOrderCart();
//		System.out.println();
//		order.addNewToppingToPizza(1, Toppings.PEPPERONI);
//		order.printPizzaOrderCart();
//		System.out.println();
//		order.removeToppingFromPizza(1, Toppings.PEPPERONI);
//		order.printPizzaOrderCart();
//		
//		try {
//			System.out.println("Your Bill is: " + order.checkout());
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}
}
