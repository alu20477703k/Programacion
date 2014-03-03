package Spanish_Lastname;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainClass {

	private static Map<String, Integer> map;
	private static String key;
	private static Integer value;
	private static BufferedReader in;

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		in = new BufferedReader(new FileReader("prueba.csv"));
		map = new HashMap<String, Integer>();
		Scanner s2 = null;
		
		String s = null;
		while((s=in.readLine())!=null){
			
			map.put(s, value);
		}
		
		System.out.println("LastName: ");
		String lastName = scanner.next();
		
		System.out.println(map);

	}

}
