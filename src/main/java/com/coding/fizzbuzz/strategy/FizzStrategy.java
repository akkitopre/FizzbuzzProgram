package com.coding.fizzbuzz.strategy;

public class FizzStrategy implements FizzBuzzStrategyImpl {

	@Override
	public String process(int number) {
		return (number % 3 == 0 && number % 5 != 0) ? "Fizz" : null;
	}

}
