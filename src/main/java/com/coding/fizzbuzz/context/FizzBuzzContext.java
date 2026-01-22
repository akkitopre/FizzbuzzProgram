package com.coding.fizzbuzz.context;

import java.util.*;

import com.coding.fizzbuzz.strategy.*;

public class FizzBuzzContext {
	
	public List<FizzBuzzStrategyImpl> strategies = Arrays.asList(new FizzStrategy());
	
	public String fizzBuzz(int number) {
		for (FizzBuzzStrategyImpl strategy : strategies) {
			String result = strategy.process(number);
			if (result != null) {
				return result;
			}
		}
		return String.valueOf(number);
	}

}
