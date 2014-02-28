package textFileAlphabetically;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	private static String l;
	private static final String FILENAME1 = "origen.txt";
	private static final String FILENAME2 = "temp.txt";

	public static void main(String[] args) throws IOException {

		File inputFile = new File(FILENAME1);
		File inputFile2 = new File(FILENAME2);
		List<String> list = new ArrayList<String>();

		BufferedReader in = new BufferedReader(new BufferedReader(
				new FileReader(inputFile)));
		PrintWriter out = new PrintWriter(new FileWriter(inputFile2));

		int textLength = 0;

		while ((l = in.readLine()) != null) {
			list.add(l);
			textLength++;
		}
		String[] s = new String[textLength];
		Collections.sort(list);
		list.toArray(s);

		for (int i = 0; i < s.length; i++) {
			out.println(s[i]);
		}
		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
		inputFile.delete();
		inputFile2.renameTo(inputFile);
	}

}
