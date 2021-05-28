package Streams;

import java.util.List;

public class Test00_MapFilter {
	/*
	 * write function return alphabet with size of 6 and make them capital
	 */
	void compute(List<String> alList) {
		alList.stream().map(String::toUpperCase).filter(s -> s.length() == 6).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alphabet = List.of("alfa", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel",
				"india", "juliet", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra",
				"tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu");
		new Test00_MapFilter().compute(alphabet);

	}

}
