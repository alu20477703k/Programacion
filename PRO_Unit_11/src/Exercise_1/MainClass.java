package Exercise_1;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {

		HashSet ht = new HashSet();
		
		ht.add("Hola");
		ht.add(3);
		ht.add('c');
		
		for (Object o : ht)
			System.out.println(o);
	}

}
