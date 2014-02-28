import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Pair<Object, Object> pair0 = new Pair<Object, Object>("uno", "dos");
		Pair<Object, Object> pair1 = new Pair<Object, Object>("tres", "cuatro");
		Pair<Object, Object> pair2 = new Pair<Object, Object>("cinco", "seis");
		Pair<Object, Object> pair3 = new Pair<Object, Object>("siete", "ocho");
		Pair<Object, Object> pair4 = new Pair<Object, Object>("nueve", "diez");

		List<Object> list = new ArrayList<Object>();

		list.add(pair0);
		list.add(pair1);
		list.add(pair2);
		list.add(pair3);
		list.add(pair4);

		System.out.println(list);

		System.out.println(pair0.toSortedString());
		System.out.println(pair1.toSortedString());
		System.out.println(pair2.toSortedString());
		System.out.println(pair3.toSortedString());
		System.out.println(pair4.toSortedString());

	}

}
