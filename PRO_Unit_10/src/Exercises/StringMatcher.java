package Exercises;

public class StringMatcher {
	
	public static boolean method1(String s) {
		// 1.- A method that returns true if the text is “true”, “True”, “yes”
		// or “Yes”
		if (s.matches("[yY]es") || s.matches("[tT]rue")) {
			return true;
		}
		return false;
	}

	public static boolean method2(String s) {
		// 2.- A method that returns true if the string contains “true”
		return s.matches(".*\\btrue\\b.*");
	}

	public static boolean method3(String s) {
		// 3.- A method that returns true if the string contains 3 letters.!
		return s.matches("(?i)[a-z]{3}");

	}

	public static boolean method4(String s) {
		// 4.- A method that returns true if the string does not have a number
		// at the beginning.!
		return s.matches("^[^0-9].*");
	}

	public static boolean method5(String s) {
		// 5.- A method that returns true if the string contains an arbitrary
		// numbers of characters except b.!
		if (s.matches("(?i).*[b].*"))
			return false;
		return true;
	}

	public static boolean method6(String s) {
		// 6.- A method that returns true if the string contains a number less
		// than 300 (using regular expression).!
		//[1-2]?[0-9]?[0-9]?

		if (s.matches(".*[0-300]{3}.*"))
			return false;
		return true;
	}

	public static boolean method7(String s) {
		//7.- A method that returns true if the string contains a valid IP number.!
		
		return s.matches("");
	}
}
