package Casting;


/**
 * @author sahil.kumar01
 *
 */
public class Static_casting {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		// Object object = "Error";
		// Note : ClassCastException

		Object obj = null;
		if (obj instanceof Integer) {
			Integer value = (Integer) obj;
			System.out.println(value);
		} else
			System.out.println((Integer) obj);
		
	}
}
