package com.coding.fizzbuzz.context;

import java.util.*;

import com.coding.fizzbuzz.strategy.*;

public class FizzBuzzContext {

	public List<FizzBuzzProcessor> strategies = Arrays.asList(
			new FizzStrategy(), 
			new BuzzStrategy()
	);

	public String fizzBuzz(int number) {
		for (FizzBuzzProcessor strategy : strategies) {
			String result = strategy.process(number);
			if (result != null) {
				return result;
			}
		}
		return String.valueOf(number);
	}

}
