package com.coding.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {
	
	// should return true in case of number 3
	@Test
	void testDivisibleBy3_with3_shouldReturnTrue() {
		assertTrue(FizzbuzzApplication.calculateDivisibleBy3(3));
	}
	
	// should return false in case of number 5
	@Test
	void testDivisibleBy3_with5_shouldReturnFalse() {
		assertFalse(FizzbuzzApplication.calculateDivisibleBy3(5));
	}

}
