package hw5.pizza.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw5.pizza.Toppings;
import hw5.pizza.VegetarianPizza;

class VegetarianPizzaTest {
	
	private VegetarianPizza vp = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		vp = new VegetarianPizza();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		String expectedToStringOutput = "VegetarianPizza [toppingList=[TOMATO, CHEESE, BELL_PEPPER, BLACK_OLIVE, MUSHROOM], priceWithoutToppings=1.5, totalPrice=8.75, pizzaOrderID=0]";
		assertEquals(expectedToStringOutput,vp.toString());
	}
	
	@Test
	void testUpdatePizzaPrice() {
		double expectedPrice = 8.75;
		double actualPrice = vp.updatePizzaPrice();
		assertEquals(expectedPrice, actualPrice);
	}
	
	@Test
	void testGetToppingList() {
		List<Toppings> expectedToppingList = new ArrayList<Toppings>();
		expectedToppingList.add(Toppings.TOMATO);
		expectedToppingList.add(Toppings.CHEESE);
		expectedToppingList.add(Toppings.BELL_PEPPER);
		expectedToppingList.add(Toppings.BLACK_OLIVE);
		expectedToppingList.add(Toppings.MUSHROOM);
		
		List<Toppings> actualToppingList = vp.getToppingList();
		assertEquals(expectedToppingList, actualToppingList);
	}

}
