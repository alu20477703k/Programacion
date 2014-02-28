package Generic_Util;

public class MainClass {

	public static void main(String[] args) {

		OrderedPair<Integer, String> p1 = new OrderedPair<Integer, String>(1, "apple");
		OrderedPair<Integer, String> p2 = new OrderedPair<Integer, String>(2, "pear");
		boolean same =	Util.<Integer, String>compare(p1, p2);
		
		if (Util.compare(p1, p2))
			System.out.println("Equals");
		else
			System.out.println("Diferents");

			
	}

}
