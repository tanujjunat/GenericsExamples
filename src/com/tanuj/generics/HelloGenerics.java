package com.tanuj.generics;

import java.util.Arrays;
import java.util.List;

public class HelloGenerics {
	
	public static void main(String[] args) {
		List<String> t = convertToObject(Arrays.asList("hello"));
		System.out.println(t);
		List<Integer> t1 = convertToObject(Arrays.asList(2));
		System.out.println(t1);
	}

	private static <T extends Object> T convertToObject(T t) {
		return t;
		
	}
	
	private List<? extends Object> convertToObjectWildCard(List<?> t) {
		return t;
		
	}

}
