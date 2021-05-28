package optional;

public class Customer {
	private final int ID;
	private final String name;

	Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + "]";
	}
}
