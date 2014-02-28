package Hangman_With_Files;

import java.io.*;
import java.util.Scanner;

public class wordGuess {

	Scanner inputValue = new Scanner(System.in);

	private String word;
	private String underScoredWord;
	static final String dataFile = "words";
	private int countWords;
	private String[] wordFromFile = new String[5]; // Question: How can I make this variable?, i mean, it only works 
													// with 5 or less values, how can I make this the same size as many words
													// in the file.

	public wordGuess() throws FileNotFoundException {
		
		Scanner s = null;
		countWords = 0;

		try {
			s = new Scanner(new BufferedReader(new FileReader(dataFile)));
			while (s.hasNext()) {
				wordFromFile[countWords] = s.next();
				countWords++;
			}
		} finally {
			if (s != null)
				s.close();
		}

		int num;
		num = (int) (Math.random() * (countWords));
		word = wordFromFile[num];
		char[] aEmpty = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			aEmpty[i] = '_';

		}
		underScoredWord = String.valueOf(aEmpty);
	}

	public int guess() throws IOException {

		boolean fin = false;
		int trys = 0;
		char[] underScoredWord2 = underScoredWord.toCharArray();

		do {
			System.out.println("Introduce una letra (" + (trys + 1) + "): ");
			String letter = inputValue.next();
			letter = letter.toLowerCase();

			if (letter.length() == 1) { // Si introduces una letra

				char[] compareWord = word.toCharArray();
				char letra = letter.charAt(0);

				for (int i = 0; i < word.length(); i++) {
					if (compareWord[i] == letra)
						underScoredWord2[i] = letra;

				}
				System.out.println(underScoredWord2);

			} else { // Una palabra
				if (letter.equals(word)) {
					System.out.println("WIN");
					fin = true;

				} else {
					System.out.println("Meeec, esa no es!");
				}
			}
			String text = String.valueOf(underScoredWord2);

			if (text.equals(word))
				fin = true;
			trys++;

		} while (fin == false);
		System.out.println("END");

		return trys;
	}

}