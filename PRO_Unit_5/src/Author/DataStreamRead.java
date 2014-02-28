package Author;
import java.io.*;

public class DataStreamRead {

	static final String dataFile = "Authors";

	public static void main(String[] args) throws IOException {

		DataInputStream in = null;
		String name, email;
		char gender;
		int count=0;

		try {
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream(dataFile)));

			try {
				while (true) {
					name = in.readUTF();
					email = in.readUTF();
					gender = in.readChar();
					
					System.out.format("Author ("+count+") %s at %s is %s\n",name,email,gender);
					count++;
				}

			} catch (EOFException e) { }
			System.out.format("");
		} finally {
			in.close();
		}
	}

}
