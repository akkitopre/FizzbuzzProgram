package com.coding.fizzbuzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {
	
	static boolean calculatedValue = false;

	public static void main(String[] args) {

		for(int i = 1; i <= 50; i++)
		{
			calculatedValue = calculateDivisibleBy3(i);
			if(calculatedValue)
			{
				System.out.println(i+" -> "+"Fizz");
			}
			else
				System.out.println(i+" -> "+calculatedValue);
		}
		
	}
	
	public static boolean calculateDivisibleBy3(int number)
	{
		return number % 3 == 0;
	}

}
