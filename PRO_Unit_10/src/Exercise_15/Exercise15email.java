package Exercise_15;

import java.util.Scanner;


public class Exercise15email {

	public static boolean checkEmail(String s) {
		String regex = "[^\\s&&[^@]]+@[(\\w+.\\w+)&&[^@]]+";
		return s.matches(regex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter email:");
		String s = input.nextLine();
		if (checkEmail(s)) 
			System.out.println("Right");
		else
			System.out.println("Wrong");
	}

}