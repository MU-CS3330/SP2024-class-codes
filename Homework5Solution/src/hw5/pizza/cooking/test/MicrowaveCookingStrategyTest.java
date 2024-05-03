package hw5.pizza.cooking.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import hw5.pizza.AbstractPizza;
import hw5.pizza.HawaiianPizza;
import hw5.pizza.MargheritaPizza;
import hw5.pizza.VegetarianPizza;
import hw5.pizza.cooking.MicrowaveCookingStrategy;

class MicrowaveCookingStrategyTest {
	
	private MicrowaveCookingStrategy mcs = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		mcs = new MicrowaveCookingStrategy();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@MethodSource("providePizzaInputs")
	void testCook(AbstractPizza pizza, boolean expected) {
		assertEquals(expected, mcs.cook(pizza));
	}
	
	
	public static Stream<Object[]> providePizzaInputs() {
		AbstractPizza pizza = null;
		return Stream.of(
			new Object[]{new VegetarianPizza(), true},
			new Object[]{new MargheritaPizza(), true},
			new Object[]{new HawaiianPizza(), true},
			new Object[]{pizza, false}
		);
	}

}
