package Exercise_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise13extension2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] extensions = args[0].split("\\.");
		if (extensions.length>1)
			System.out.println("Extension: "+extensions[extensions.length-1]);
		else
			System.out.println("No extension");
	}

}