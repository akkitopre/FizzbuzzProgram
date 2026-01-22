package com.coding.fizzbuzz.strategy;

public class BuzzStrategy implements FizzBuzzProcessor {

	@Override
	public String process(int number) {
		return (number % 5 == 0 && number % 3 != 0) ? "Buzz" : null;
	}

}