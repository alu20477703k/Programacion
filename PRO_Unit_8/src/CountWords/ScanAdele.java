package CountWords;

import java.io.*;
import java.util.Scanner;

public class ScanAdele {
	public static void main(String[] args) throws IOException {

		Scanner s = null;
		int nWords = 0;
		try {
			s = new Scanner(new BufferedReader(new FileReader(args[0])));
			while (s.hasNext()) {
				s.next();
				nWords++;
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
		System.out.println("Number of Words: "+nWords);
	}
}
