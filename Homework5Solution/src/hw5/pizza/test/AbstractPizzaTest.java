package hw5.pizza.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw5.pizza.AbstractPizza;
import hw5.pizza.MargheritaPizza;
import hw5.pizza.Toppings;

class AbstractPizzaTest {
	
	private AbstractPizza absPizza = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		absPizza = new MargheritaPizza();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testSetToppingList() {
		List<Toppings> list = new ArrayList<>();
		list.add(Toppings.CHEESE);
		list.add(Toppings.MUSHROOM);
		
		List<Toppings> expList = new ArrayList<>();
		expList.addAll(list);
		
		absPizza.setToppingList(list);
		assertEquals(expList, absPizza.getToppingList());
	}

}
