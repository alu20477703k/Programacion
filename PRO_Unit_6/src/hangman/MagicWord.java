package hangman;
public class MagicWord {
	private static final String[] words = {"patata","piramide",
						"escalera", "catapulta","sacapuntas"};
	private int numWord;
	private String word;
	private StringBuilder publicWord;
	
	public MagicWord() {
		numWord = (int) (Math.random()*words.length);
		word = words[numWord];
		char[] arr = new char[word.length()];
		for (int i=0; i<word.length(); i++) {
			arr[i]='_';
		}
		publicWord = new StringBuilder(new String(arr));
	}
	public boolean check(String s) {
		if (s.length()==1) {
			checkChar(s.charAt(0));
		    return false;
		} else {
			return checkWord(s);
		}
	}
	private void checkChar(char ch) {
		for (int i=0; i<word.length(); i++) {
			if (word.charAt(i)==Character.toLowerCase(ch)) {
				publicWord.setCharAt(i, ch);
			}
		}
	}
	private boolean checkWord(String s) {
		if (s.equalsIgnoreCase(words[numWord])) {
			System.out.println(words[numWord] + " ");
			return true;
		}
		return false;
	}
	
	public String getUnderscoreString() {
		return publicWord.toString();
	}
}
