import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public void reverseAndRemoveDuplicates(String arg) throws IOException {

		String fileName1 = arg; // Filename from the argument List
		String fileName2 = "temp.txt"; // Temp File

		File inputFile = new File(fileName1);// inputfile <- Filename from the
												// argument List
		File inputFile2 = new File(fileName2); // inputfile2 <- Temp File

		BufferedReader in = null;
		PrintWriter out = null;

		List<String> list = new ArrayList<String>();
		String tempString = null;  // It will store each line of the file.

		int arrayLength = 0; // to know the number of lines

		try {

			in = new BufferedReader(new FileReader(fileName1));
			out = new PrintWriter(new FileWriter(fileName2));

			while ((tempString = in.readLine()) != null) {
				list.add(tempString);
				arrayLength++;
			}
			String[] text = new String[arrayLength];
			String[] str = new String[arrayLength];
			list.toArray(text);

			Set<String> s = new HashSet<String>(Arrays.asList(text));
			s.toArray(str);

			for (Object o : s)
				out.println(o);

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
		inputFile.delete();
		inputFile2.renameTo(inputFile);
	}
}
