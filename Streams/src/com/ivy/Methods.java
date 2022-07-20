package com.ivy;

import java.util.*;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// filter(Predicate)
		// boolean value function
		// e->e>10

		// map(Function)
		/*
		 * each element operation
		 */

		List<String> names = Arrays.asList("Rushikesh", "Yash", "Roopam", "Ashwin", "Sahil");
//		List<String> names=List.of("Rushikesh", "Yash", "Roopam", "Ashwin", "Sahil");             // List.of got introduced in Java 9 , this code is of java 8
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);

		//List<Integer> numbers = List.of(23, 4, 5, 43, 76, 35, 28, 91);
		//List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		//System.out.println(newNumbers);
		// or
		//newNames.stream().forEach(System.out::println);
		//for sorted
		
		//newNames.stream().sorted().forEach(System.out::println);
		
		//Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
		//System.out.println("min "+integer);
		
		//Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
		//System.out.println("max "+integer1);
	}

}
