package CSV;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, LinkedListException {
		BufferedReader in = null;
		String[] header;
		int[] values;
		int countFields = 0;
		try {
			in = new BufferedReader(new FileReader("test.csv"));
			String s = null;
			Scanner s2 = null;

			// Header
			Queue q = new Queue();
			s = in.readLine();

			try {
				s2 = new Scanner(s);
				s2.useDelimiter(",");
				while (s2.hasNext()) {
					q.push(s2.next());
					countFields++;
				}
			} finally {
				s2.close();
			}
			header = new String[countFields];
			for (int i = 0; i < countFields; i++) {
				header[i] = (String) q.pop();
			}
			// ---------
			values = new int[countFields];
			for (int i = 0; i < countFields; i++) {
				values[i] = 0;
			}

			int countPos;
			while ((s = in.readLine()) != null) {
				try {
					s2 = new Scanner(s);
					s2.useDelimiter(",");
					countPos = 0;
					while (s2.hasNext()) {
						if (countPos>=countFields) {
							System.err.println("Error in CSV file");
							System.exit(1);
						}
						values[countPos] += Integer.parseInt(s2.next()
								.replaceAll("[^0-9-]", ""));
						countPos++;
					}
				} finally {
					s2.close();
				}
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		for (int i = 0; i < countFields; i++) {
			System.out.println(header[i] + ": " + values[i]);
		}
	}

}
