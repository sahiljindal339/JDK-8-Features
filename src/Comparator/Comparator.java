package Comparator;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
	int compare(T t1, T t2);

	@SuppressWarnings("unchecked")
	static <T, U extends Comparable<? super U>> Comparator<Customer> comparing(Function<T, U> getLastName) {
		// TODO Auto-generated method stub
		return (o1, o2) -> {
			// TODO Auto-generated method stub
			return getLastName.apply((T) o1).compareTo(getLastName.apply((T) o2));

		};
	}

}
