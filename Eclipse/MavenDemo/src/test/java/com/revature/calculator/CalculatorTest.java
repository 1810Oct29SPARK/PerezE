package com.revature.calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

	private Calculator c;

	@Before
	public void setCalculator() {
		this.c = new Calculator();
	}

	/*
	 * TDD: red-green refactoring start with requirement, write test, build code to
	 * match
	 * 
	 * Calculator requirments: (Calculator class) (computes Double values of a
	 * comma-separated string) 
	 * 1. calling add("") returns Double value of 0  
	 * 2. calling add() two comma-separated values returns the sum of those values
	 * 3. calling add() with null returns zero
	 * 4. calling add() with > 2 arguments throws CalculatorException
	 * 5. calling add() with incorrect characters (anything but , and Doubles) 
	 * throws CalculatorException
	 */

	@Test
	public void emptyStringReturnsZero() {
		assertEquals(0, c.add(""), .001); // floating-point assertions require an offset
	}

	@Test
	public void twoNumbersReturnsSum() {
		assertEquals(28.2, c.add("12.9,15.3"), .001);
	}
	
	@Test 
	public void returnZeroIfNull() {
		assertEquals(0, c.add(null), .001);
	}

}
