package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();
		for (int i = 3; i > 0; i--)
			customerList.add(new Customer("name" + i, "lastname" + i, i));
		Function<Customer, String> getLastName = s -> s.getLastName();
		Comparator<Customer> cmp = Comparator.comparing(getLastName);
		System.out.println(cmp.compare(customerList.get(1), customerList.get(0)));
	}

	/*
	 * private static Comparator<Customer> getComparator(Function<Customer, String>
	 * getLastName) { // TODO Auto-generated method stub return new
	 * Comparator<Customer>() {
	 * 
	 * @Override public int compare(Customer o1, Customer o2) { // TODO
	 * Auto-generated method stub return
	 * getLastName.apply(o1).compareTo(getLastName.apply(o2)); }
	 * 
	 * }; }
	 */
}
