package Exercise_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9countVowels {

	private static final String FILENAME = "text.txt"; 
	
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		File inputFile = new File(FILENAME);
		int count = 0;
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			String l;
			Pattern pattern = Pattern.compile("(i?)(u?)[aeiouáéíóúÁÉÍÓÚ]");
			Matcher matcher;
            while ((l = inputStream.readLine()) != null) {
            	matcher = pattern.matcher(l);
            	while (matcher.find()) {
            		count ++ ;
            	}
            }
            System.out.println(count+" vowels.");
		} finally {
			if (inputStream != null) {
                inputStream.close();
            }
		}

	}

}