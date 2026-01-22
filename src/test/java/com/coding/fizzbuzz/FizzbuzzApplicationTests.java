package com.coding.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.coding.fizzbuzz.context.FizzBuzzContext;

@SpringBootTest
class FizzbuzzApplicationTests {

	FizzBuzzContext context = new FizzBuzzContext();

	// should return Fizz since it is divisible by 3
	@Test
	void testFizz() {
		assertEquals("Fizz", context.fizzBuzz(3));
		assertEquals("Fizz", context.fizzBuzz(6));
	}
	
	// should return Buzz since it is divisible by 5
	@Test
	void testBuzz() {
		assertEquals("Buzz", context.fizzBuzz(5));
		assertEquals("Buzz", context.fizzBuzz(10));
	}

	// should return FizzBuzz since it is divisible by both 3 and 5
	@Test
	void testFizzBuzz() {
		assertEquals("FizzBuzz", context.fizzBuzz(15));
		assertEquals("FizzBuzz", context.fizzBuzz(30));
	}

	// should return same number since it is not divisible by 3 or 5
	@Test
	void testDefault() {
		assertEquals("1", context.fizzBuzz(1));
		assertEquals("2", context.fizzBuzz(2));
	}
}
