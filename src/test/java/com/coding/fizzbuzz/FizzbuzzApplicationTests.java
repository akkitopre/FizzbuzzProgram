package com.coding.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.coding.fizzbuzz.context.FizzBuzzContext;

@SpringBootTest
class FizzbuzzApplicationTests {

	FizzBuzzContext context = new FizzBuzzContext();

	@Test
	void testFizz() {
		assertEquals("Fizz", context.fizzBuzz(3));
		assertEquals("Fizz", context.fizzBuzz(6));
	}

	@Test
	void testBuzz() {
		assertEquals("Buzz", context.fizzBuzz(5));
		assertEquals("Buzz", context.fizzBuzz(10));
	}

	@Test
	void testDefault() {
		assertEquals("1", context.fizzBuzz(1));
		assertEquals("2", context.fizzBuzz(2));
	}
}
