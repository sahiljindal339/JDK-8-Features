package Streams;

import java.util.List;

import Predicate.Predicate;

public class Test05_FunctionCombination {
	public static void main(String[] args) {
		/*
		 * That same we can use to validate incoming input
		 * by creating different condition.
		 */
		List<Predicate<String>> predicateList = List.of((String::isEmpty), (s -> s.length() == 6), s -> s != null);
		Predicate<String> list = predicateList.stream().reduce(Predicate -> true, Predicate::and);
		System.out.println(list.test("Hi Sahil"));
		
		
		// SECOND EXAMPLE OF FUNCTIONAL - COMBINATION
		
		
	}

}
