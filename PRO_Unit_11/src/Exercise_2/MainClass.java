package Exercise_2;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {

		HashSet<Integer> ht = new HashSet<Integer>();

		ht.add(0);
		ht.add(1);
		ht.add(2);
		ht.add(6);
		ht.add(12);

		System.out.println("Before incrementing: " + ht);
		ht = increment(ht);
		System.out.println("After incrementing: " + ht);

	}

	private static HashSet<Integer> increment(HashSet<Integer> ht) {

		HashSet<Integer> ht2 = new HashSet<Integer>();

		for (int i = 0; i <= ht.hashCode(); i++) {
			if (ht.contains(i)) {
				ht2.add(i + 1);
			}
		}
		return ht2;

	}

}
