package com.coding.fizzbuzz.strategy;

public class DefaultStrategy implements FizzBuzzStrategyImpl {

	@Override
	public String process(int number) {
		return String.valueOf(number);
	}

}
