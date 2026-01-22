package com.coding.fizzbuzz.strategy;

public class FizzStrategy implements FizzBuzzProcessor {

	@Override
	public String process(int number) {
		return (number % 3 == 0 && number % 5 != 0) ? "Fizz" : null;
	}

}
