package toUpperCase;
import java.io.*;

public class Transform {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(args[0]));
			outputStream = new PrintWriter(new FileWriter(args[1]));
			String l;

			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l.toUpperCase());
				String upper = l.toUpperCase();
				System.out.println(upper);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
