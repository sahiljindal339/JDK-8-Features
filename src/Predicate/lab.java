package Predicate;

public class lab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate = String::isEmpty;
		Predicate<String> predicate2 = predicate.negate();
		/*
		 * negate = (functional lambda) t -> calling predicate and nor operation of
		 * define explain in line = 10
		 */
		System.out.println(predicate.test("sahil"));
		System.out.println(predicate2.test(""));

		// CHECK IF STRING IS NOT NULL AND NON EMPTY

		Predicate<String> p1 = (s) -> s != null;
		Predicate<String> p2 = (String::isEmpty);

		/*
		 * Note : it will use if you have multiple condition to check for any pay load
		 * you can create different predicate for each use case and combination will use
		 * to validate any pay-load it will opt code by re using same predicate
		 */
		Predicate<String> p3 = (p1.and(p2)).and(p2);
		System.out.println(p3.test("s"));
	}

}