package SortedTextFile;

import java.io.*;
import java.util.Scanner;

public class SortedTextFile {

	static String dataFile = "";
	static String writeFile = "";
	private String[] Lines;

	public SortedTextFile(String str, String str2) throws IOException {

		dataFile = str;
		writeFile = str2;

	}

	public String getName() {
		return dataFile;
	}

	public void put(String s) throws IOException {

		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader(dataFile));
			out = new PrintWriter(new FileWriter(writeFile));
			String line;

			while ((line = in.readLine()) != null) {
				out.println(line);
			}

		} finally {
			in.close();
			out.close();
		}

	}

	public void getNumElements() {

	}

}
