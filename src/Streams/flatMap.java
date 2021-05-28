package Streams;

import java.util.ArrayList;
import static java.util.stream.Collectors.toList;
import java.util.List;

public class flatMap {
	
	private static List<String> expand(String s) {
        return s.codePoints()
                .mapToObj(codePoint -> Character.toString((char) codePoint))
                .collect(toList());
    }


	/*
	 * Flat Map - Intermediate stream Option 
	 * May produce  Zero , one or more value
	 * as Contrast to Map which take one value and produce one value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aList  = new ArrayList<>();
		aList.add("alfa");
		aList.add("Bravo");
		aList.add("charlie");
		
		List<String> al = aList.stream().flatMap(s -> expand(s).stream()).collect(toList());
		System.out.println(al);
		
	}

}
