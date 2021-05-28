package optional;

import java.util.*;

/**
 * @author Iron
 *
 */
public class lab {
	// Note USE CASE : Find particular customer by ID
	public static String customerNameById(List<Customer> cList, int ID) {
		// Note : when to use Optional ?
		// * when you have to return value and if value == Null
		// * in - place of Null you want to send something different.
		// Example - search ALGO you have meaning of NULL
		// * isPresent() ->True(if value is present) False(not present)
		// * Never use Null with optional.
		Optional<Customer> op = cList.stream().filter(c -> c.getID() == ID).findFirst();
		// Before use `Optional`.get just confirm if value is present or not
		// return op.isPresent() ? op.get().getName() : "UNKNOWN";

		// Use Of MAP , orElse
		return op.map(Customer::getName).orElse("UNKNOWN");
		// Map - if value present it will transform value and mapped
		// - if value is not present it will throw empty optional
		// orElse - check if it has Null optional than it throw default value.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			customerList.add(new Customer(i, "name " + i));
		System.out.println(customerNameById(customerList, 2)); // Output => name2
		System.out.println(customerNameById(customerList, 12)); // Output => UNKNOW

		// how to check if value is null OR not Null
		// * System.out.println(Optional.ofNullable(null).orElse("YES"));
	}

}

// Declaration of Optional 
// Optional.of(T) - T is not null
// Optional.empty() - Null optional


// where not to USE optional
// If we use access of Optional increase CPU overhead as well as Memory.
