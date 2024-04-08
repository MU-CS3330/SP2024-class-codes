package edu.mu.maven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StringAlgoritmhsTest {
	
	StringAlgorithms algs = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initializing StringAlgorithms object");
		algs = new StringAlgorithms();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// BAD Practice
	// You can have multiple assertions in a single test method, but if one fails other assertions
	// will not be executed. Therefore, it is not ideal to have multiple assertions in a single test method
	@Test
	void testIsPalindrome() {
		System.out.println("Test Hello");
		assertEquals(false, algs.isPalindrome("hello"));
		System.out.println("Test Radar");
		assertEquals(true, algs.isPalindrome("radar"));
		System.out.println("Test Level");
		assertEquals(true, algs.isPalindrome("level"));
	}
	
	// GOOD Practice
	// You can run parameterized test which is ideal to test with multiple different inputs and scenarios
	@ParameterizedTest
	@MethodSource("provideStringsForIsPalindrome")
	public void testIsPalindrome(String input, boolean expected) {
		assertEquals(expected, algs.isPalindrome(input));
	}
	
	public static Stream<Object[]> provideStringsForIsPalindrome() {
		return Stream.of(
			new Object[]{"radar", true},
			new Object[]{"level", true},
			new Object[]{"hello", false}
		);
	}

}
