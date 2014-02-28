package CountLines;
import java.io.*;

public class CountLines {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(args[0]));
			String l;
			int lines = 0;

			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);
				lines++;
			}
			System.out.println("\nNumber of lines: "+lines);
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}

