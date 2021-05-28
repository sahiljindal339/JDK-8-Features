package Comparator;

public class Customer {
	private final String FirstName;
	private final String LastName;
	private final int Age;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Customer(String firstName, String lastName, int age) {
		FirstName = firstName;
		LastName = lastName;
		Age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + "]";
	}

}
