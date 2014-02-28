package Exercise_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise11theZe {

	private static final String FILENAME = "text.txt"; 	
	private static final String REGEX = "(?i)\\bthe\\b";
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		File inputFile = new File(FILENAME);
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			String l;

            while ((l = inputStream.readLine()) != null) {	 
            	System.out.println(l.replaceAll(REGEX, "ze"));
            }
            
		} finally {
			if (inputStream != null) {
                inputStream.close();
            }
		}

	}

}