package com.ivy;


import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream API - collection process
		//Collection/group of object
		
		//1- blank
		Stream<Object> emptyStream = Stream.empty();
		
		//2.-array ,object,collection
		String names[] = {"Rushikesh" ,"Yash" ,"Roopam","Ashwin","Sahil"};
		
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//3
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4
		IntStream stream = Arrays.stream(new int[] {2,4,65,3,564,});
		stream.forEach(e->{
			System.out.println(e);
		});
		
		//5. List,Set
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(56);
		list2.add(24);
		list2.add(76);
		list2.add(23);
		
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
	}

}
