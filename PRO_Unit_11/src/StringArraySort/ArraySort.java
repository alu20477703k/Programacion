package StringArraySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static String[] arrayString={"hola","pepe","adios","ordenador","gafas","raton"};
	
	public static void main(String[] args) {
		
		ArraySortString(arrayString);
		
		for(int i=0;i<arrayString.length;i++){
			System.out.println(arrayString[i]);
		}
	}

	public static void ArraySortString(String[] s) {
		
		List<String> list = Arrays.asList(s);
		Collections.sort(list);
		
		list.toArray(arrayString);
	}
}
