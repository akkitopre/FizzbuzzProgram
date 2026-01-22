package com.coding.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {
	
	// should return true in case of number 3
	@Test
	void testDivisibleBy3_with3_shouldReturnTrue() {
		
		int number = 3;
		boolean calculatedValue = FizzbuzzApplication.calculateDivisibleBy3(number);
		assertEquals(true, calculatedValue);
		
	}
	
	// should return false in case of number 5
	@Test
	void testDivisibleBy3_with5_shouldReturnFalse() {
		
		int number = 5;
		boolean calculatedValue = FizzbuzzApplication.calculateDivisibleBy3(number);
		assertEquals(false, calculatedValue);
		
	}

}
