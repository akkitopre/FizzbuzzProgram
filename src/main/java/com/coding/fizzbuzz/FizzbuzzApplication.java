package com.coding.fizzbuzz;

import java.util.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		
		int startingNumber = 1;
		int endingNumber = 100;

		// Keeping Fizzbuzz in Map for flexibility to add another values
		Map<Integer, String> fizzbuzzMap = new LinkedHashMap<>();
		fizzbuzzMap.put(3, "Fizz");
		fizzbuzzMap.put(5, "buzz");
		
		for(int num = startingNumber; num <= endingNumber; num++)
		{
			System.out.println(fizzbuzzLogic(num, fizzbuzzMap).isEmpty() ? num : num + " -> " + fizzbuzzLogic(num, fizzbuzzMap));
		}
	}
	
	public static String fizzbuzzLogic(int number, Map<Integer, String> fizzbuzzMap)
	{
		StringBuilder result = new StringBuilder();
		for(Map.Entry<Integer, String> fbMap : fizzbuzzMap.entrySet())
		{
			if(number % fbMap.getKey() == 0)
			{
				if(!result.isEmpty())
				{
					result.append(" "); // for space between Fizz buzz
				}
				result.append(fbMap.getValue());
			}
		}
		return result.toString();
	}
}
