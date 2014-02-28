package PrintDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static String[] array = { "Hola", "Hola", "Hola", "Adios", "No", "Si" };

	public static void main(String[] args) {

		List<String> list = Arrays.asList(array);
		String temp,repe=null;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			if(Collections.frequency(list, temp) >= 2 && temp != repe){
				repe = temp;
				System.out.println("Duplicated: "+temp);
			}
		}

	}

}
