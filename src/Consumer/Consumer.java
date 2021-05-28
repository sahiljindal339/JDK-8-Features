package Consumer;

@FunctionalInterface
public interface Consumer<T> {
	// Note : Abstract Function and implementation pass as Lambda function.
	void accept(T t);

	default Consumer<T> addthen(Consumer<T> other) {
		/*
		 * we have to return lambda function because Consumer<T> is function interface
		 * Consumer<T> : functional Interface expect lambda function as Parmeters you
		 * have to pass lambda or return Lambda
		 */
		return (T t) -> {
			this.accept(t);
			other.accept(t);
		};
	}
}
