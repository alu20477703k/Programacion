package Spanish_Lastname_ORDERED;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class MainClass {

	private static Map<String, String> map;
	private static List<String> list;
	private static BufferedReader in;
	private static PrintWriter out;
	private static Scanner scanner;
	private static String key;

	public static void main(String[] args) throws IOException {

		scanner = new Scanner(System.in);

		in = new BufferedReader(new FileReader("LastnameFrequencies.csv"));
		out = new PrintWriter(new FileWriter("OrderedSpanishFrequencies.csv"));

		map = new HashMap<String, String>(100000);
		list = new ArrayList<String>();
		Scanner s2 = null;

		String s = null;
		String lastName = null;

		try {
			while ((s = in.readLine()) != null) {

				if (s.equals("")) {
					continue;
				} else {
					s2 = new Scanner(s).useDelimiter(",");
					map.put(key = s2.next(), s2.next());
					list.add(key);
				}
			}
		} finally {
			s2.close();
		}

		for (Map.Entry<String, String> e : map.entrySet())
			System.out.println(e.getKey() + ": " + e.getValue());

		System.out.println("LastName: ");
		lastName = (scanner.next()).toUpperCase();

		if (map.get(lastName) == null)
			System.out.println("Lastname " + lastName + " not found");
		else
			System.out.println("Lastname " + lastName
					+ " found and has a frequency of: " + map.get(lastName));
		
		Collections.sort(list);

		for (Object o : list) {
			out.print(o + ",");
			out.print(map.get(o));
			out.println();
		}
		out.close();
	}

}
