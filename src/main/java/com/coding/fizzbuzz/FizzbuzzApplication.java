package com.coding.fizzbuzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coding.fizzbuzz.context.FizzBuzzContext;

@SpringBootApplication
public class FizzbuzzApplication {
	
	static FizzBuzzContext context = new FizzBuzzContext();

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " -> " + context.fizzBuzz(i));
		}
	}
}
