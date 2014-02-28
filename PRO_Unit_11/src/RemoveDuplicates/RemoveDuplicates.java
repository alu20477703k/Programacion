package RemoveDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static String[] array = { "1", "2", "3", "3", "4" };

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>(Arrays.asList(array));
		System.out.print(s);
	}
}
