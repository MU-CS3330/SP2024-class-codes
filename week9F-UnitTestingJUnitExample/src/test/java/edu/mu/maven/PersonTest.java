package edu.mu.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person p = null;
	//private static Person p2 = null;

	// This method will be invoked even before setUp() method and will be executed once
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Running Before All");
		//p2 = new Person("Jack", 11);
	}

	// This method will be executed after all test methods and tearDown() invocations are complete
	// This will be the last method to be executed this test class.
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	// This method will be invoked for each test method
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Running Before Each");
		p = new Person("Ekin", 10);
	}

	// This method will be executed after the test method execution is complete
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void testGetName() {
		assertEquals("Ekin", p.getName());
	}
	
	@Test
	void testGetAge() {
		assertEquals(10, p.getAge());
	}
	
	@Test
	@Order(2)
	void testSetName() {
		p.setName("Jane");
		assertEquals("Jane", p.getName());
	}
	
	// It is important to select test inputs around the boundaries
	@Test
	void testIsOldTrue() {
		Person oldPerson = new Person("Ekin", 23);
		assertEquals(true, oldPerson.isOld());
	}
	
	@Test
	void testIsOldFalse() {
		Person oldPerson = new Person("Ekin", 22);
		assertEquals(false, oldPerson.isOld());
	}
}
