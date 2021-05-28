package Consumer;

import java.util.ArrayList;
import java.util.List;

public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<List<String>> c1 = list -> list.add("one");
		Consumer<List<String>> c2 = list -> list.add("second");

		/*
		 * Now we have to create one consumer which will accept two consumer and return
		 * one lambda function.
		 */
		Consumer<List<String>> c3 = c1.addthen(c2);
		/*
		 * In above Line , we declare `AddThen` default method this method will return
		 * Lambda function
		 * 
		 * @param Consumer<T>
		 * 
		 * @return Consumer<T>
		 */
		List<String> list = new ArrayList<String>();
		list.add("some");
		c3.accept(list);
		System.out.println(list); // Expected O/p : ["some" , "one" , "second"]
	}

}
