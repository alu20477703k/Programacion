package Exercise_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Exercise14MisspelledWords {

	private static final String FILENAME = "misspellings.txt"; 
	
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		File inputFile = new File(FILENAME);
		
		boolean right = true;
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			String l;
            while (((l = inputStream.readLine()) != null) && (right)) {
            	if (!l.matches("\\b[\\w- ']+\\b\\s\\([\\w- ']+\\)"))  {
            		right=false;
            		System.out.println("Error in: "+l);
            	}
            }
            if (right)
            	System.out.println("correcto");
            else
            	System.out.println("incorrecto");
		} finally {
			if (inputStream != null) {
                inputStream.close();
            }
		}

	}

}