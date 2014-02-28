package Author;
import java.io.*;
public class DataStreamWrite {
	
	static final String dataFile = "Authors";
	
	public static void main(String[] args) throws IOException {

		Author[] author = new Author[4];
		
		author[0]= new Author("Juan", "Juan@gmail.com", 'M');
		author[1] = new Author("Luis", "Luis@gmail.com", 'M');
		author[2] = new Author("Maria", "Maria@gmail.com", 'F');
		author[3] = new Author("David", "David@gmail.com", 'M');
		
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));

			for (int i = 0; i <= 3; i++) {
				out.writeUTF(author[i].getName());
				out.writeUTF(author[i].getEmail());
				out.writeChar(author[i].getGender());
			}
		} finally {
			out.close();
		}
	}

}
