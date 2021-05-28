package Playground;

public class Customer {
	private final int ID ;

	/**
	 * @param iD
	 */
	public Customer(int iD) {
		super();
		ID = iD;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + "]";
	} 
	
}
