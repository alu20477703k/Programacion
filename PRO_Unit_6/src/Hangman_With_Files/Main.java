package Hangman_With_Files;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		wordGuess word = new wordGuess();
		
		System.out.println("Has tardado en adivinarlo " + word.guess() +" trys");
		
		
		
		
	}

}
