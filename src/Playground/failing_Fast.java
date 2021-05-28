package Playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class failing_Fast {
	public static Optional<Customer> findCustomer(int customerId, List<Customer> customerlist) {
		return customerlist.stream().filter(s-> s.getID()==customerId).reduce((element, otherElement) -> {
			 throw  new IllegalStateException();
		});

	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<Customer> customerlist = new ArrayList<>();
		for(int  i = 0 ; i < 4 ; i++)
			customerlist.add(new Playground.Customer(i));
		customerlist.add(new Playground.Customer(6));
		Optional<Customer> op = failing_Fast.findCustomer(7, customerlist);
		op.ifPresent(System.out::println);
	}

}
