/*Write a program that reads in text from standard input and prints it back out, removing any
trailing whitespace on a line and replacing all tabs with 4 spaces.*/

package Exercise_12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise12spacesTabs {

	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new InputStreamReader(System.in));
			String l;

            while ((l = inputStream.readLine()) != null) {	 
            	String s = l.replaceAll("^ *", "");
            	s = s.replaceAll("\\t", "    ");
            	System.out.println(s);
            }
            
		} finally {
			if (inputStream != null) {
                inputStream.close();
            }
		}

	}

}