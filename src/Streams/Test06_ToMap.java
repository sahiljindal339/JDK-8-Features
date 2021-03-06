package Streams;
import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;

public class Test06_ToMap {

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
		Map<String, String> result = sonnet.stream()
                .collect(toMap(word -> word.substring(0, 1),
                        word -> word,
                        (line1, line2) -> line1 + "\n" + line2
                		));
		System.out.println(result);
	}

}
