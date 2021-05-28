package Streams;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Test03_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sonnet = List.of(
	            "From fairest creatures we desire increase,",
	            "That thereby beauty's rose might never die,",
	            "But as the riper should by time decease,",
	            "His tender heir might bear his memory:",
	            "But thou contracted to thine own bright eyes,",
	            "Feed'st thy light's flame with self-substantial fuel,",
	            "Making a famine where abundance lies,",
	            "Thy self thy foe, to thy sweet self too cruel:",
	            "Thou that art now the world's fresh ornament,",
	            "And only herald to the gaudy spring,",
	            "Within thine own bud buriest thy content,",
	            "And, tender churl, mak'st waste in niggarding:",
	            "Pity the world, or else this glutton be,",
	            "To eat the world's due, by the grave and thee.");
		
	    /**
	     * Given the lines of the sonnet, split each line into words and
	     * return a single list of all words.
	     */
		
		List<String> res = sonnet.stream().flatMap(s -> Arrays.stream(s.split(" +"))).collect(toList());
		System.out.println(res);
		
	}

}
