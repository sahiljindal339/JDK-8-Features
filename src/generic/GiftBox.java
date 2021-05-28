package generic;

public class GiftBox<T> implements Comparable<T>{

	private T gift;

	public void wrap(T gift) {
		this.gift = gift;
	}

	public T unwrap() {
		return this.gift;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
