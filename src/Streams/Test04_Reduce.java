package Streams;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Test04_Reduce {
	public static void main(String[] args) {
		/*
		 * 
		 * Performs a reduction on the elements of this stream, using the provided
		 * identity value and an associative accumulation function, and returns the
		 * reduced value. This is equivalent to:
		 *  T result = identity;
		 *  for (T element : this stream)
		 *   	result = accumulator.apply(result, element)
		 *   	return result;
		 */
		long number = 21;
		BigInteger factoBigInteger = LongStream.rangeClosed(1, number).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,
				BigInteger::multiply);
		System.out.println(factoBigInteger);
	}
}
