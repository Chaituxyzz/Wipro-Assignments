package com.junitExamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calc;

	@BeforeEach
	void setUp()  {
		
		calc=new Calculator();
	}

	@Test
	void testAddition() {
		int result= calc.add(3, 5);
		assertEquals(8, result , "3+5 should be 8");
		}
	
	@Test
	 void testWithNegativeNumbers() {
	     int result = calc.add(-3, -5);
	        assertEquals(-8, result, "-3 + (-5) should be -8");
	    }
	
	@Test
	void testWithZero() {
		int result= calc.add(0, -5);
		assertEquals(-5 , result, "0+(-5) should be -5");
	}
	
	@Test
	void testSub() {
		int result=calc.sub(10, 5);
		assertEquals(5 ,result ," should be 5");
	}
	
	@Test
	void multiply() {
		int result=calc.multiply(5, 3);
		assertEquals(15, result);
	}
	
	@Test
	void div() {
		int result=calc.div(15, 3);
		assertEquals(5, result ,"15/3 should be 5");
	}

    
    @Test
    void testModulo() {
    	
    	int result=calc.modulo(10, 3);
       assertEquals(1, result, "10 % 3 should be 1");
    }

}
