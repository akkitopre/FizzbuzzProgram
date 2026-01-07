package com.coding.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

class FizzbuzzApplicationTests {

	@Test
	void testFizzBuzzLogic() {
        Map<Integer, String> rules = new LinkedHashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "buzz");

        assertEquals("", FizzbuzzApplication.fizzbuzzLogic(1, rules));
        assertEquals("", FizzbuzzApplication.fizzbuzzLogic(2, rules));
        assertEquals("Fizz", FizzbuzzApplication.fizzbuzzLogic(3, rules));
        assertEquals("buzz", FizzbuzzApplication.fizzbuzzLogic(5, rules));
        assertEquals("Fizz buzz", FizzbuzzApplication.fizzbuzzLogic(15, rules));
    }

}
