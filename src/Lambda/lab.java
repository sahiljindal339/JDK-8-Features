package Lambda;

import java.util.function.Consumer;

public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Note : Lambda basically is function.
		// ~ In Java we have no function.
		// ~ we create functional Interface and provide implementation
		// of function using Lambda.
		// ~ you have to check parameter and return type

		Consumer<String> consumer = (s) -> System.out.print(s);
		consumer.accept("sahil");
		
		
		
	}

}
