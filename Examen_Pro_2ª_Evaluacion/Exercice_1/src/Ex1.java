import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public void reverse(String arg) throws IOException {

		String fileName1 = arg; // Filename from the argument List
		String fileName2 = "temp.txt"; // Temp File

		File inputFile = new File(fileName1); // inputfile <- Filename from the
												// argument List
		File inputFile2 = new File(fileName2); // inputfile2 <- Temp File

		BufferedReader in = null;
		PrintWriter out = null;

		List<String> list = new ArrayList<String>();
		String tempString = null; // It will store each line of the file.

		int arrayLength = 0; // to know the number of lines

		try {

			in = new BufferedReader(new FileReader(fileName1));
			out = new PrintWriter(new FileWriter(fileName2));

			while ((tempString = in.readLine()) != null) {
				list.add(tempString); // put every line in the list.
				arrayLength++; // increase the array
			}

			String[] text = new String[arrayLength]; // create an array "text"
														// of the exact number
														// of lines
			list.toArray(text); // put every element of the list to the array
								// "text"

			for (int k = text.length - 1; k >= 0; k--) {
				out.println(text[k]); // print to the file in reverse order
			}

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
		inputFile.delete(); // delete the original file
		inputFile2.renameTo(inputFile); // rename the temp.
	}
}
