package Predicate;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T> {

	boolean test(T t);

	// Note : it will convert the boolean.
	default Predicate<T> negate() {
		return t -> !this.test(t);
	}

	// this default implement with and both predicate condition
	// @param predicate<T>
	// @return predicate<T>
	default Predicate<T> and(Predicate<T> p2) {
		Objects.nonNull(p2);
		return t -> (this.test(t) && !p2.test(t));
	}
}
