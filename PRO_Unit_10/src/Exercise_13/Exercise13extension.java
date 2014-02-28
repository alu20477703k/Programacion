package Exercise_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise13extension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\.\\w+$");	
		Matcher match = pattern.matcher(args[0]);
		if (match.find())
			System.out.println("extension: "+match.group());

	}

}