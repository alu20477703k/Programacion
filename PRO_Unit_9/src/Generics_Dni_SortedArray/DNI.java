package Generics_Dni_SortedArray;

public class DNI {

	private int number;
	private char letter;
	private final static char[] letters={
										'T','R','W','A','G','M',
										'Y','F','P','D','X','B',
										'N','J','Z','S','Q','V',
										'H','L','C','K','E'
									};
	public DNI(){
		
		number=0;
		letter='T';
		
	}
	
	public DNI(int num) throws NIFException{
		
		number = num;
		
		if (number < 0)
			throw new NIFException();
		
		letter = letters[num%23];	
	}
	
	public DNI(int num, char let) throws NIFLetterException, NIFException {
		number=num;
		
		if (number < 0)
			throw new NIFException();
		
		char myLetter=letters[num%23];
		letter=myLetter;
		if (letter !=Character.toUpperCase(let))
			throw new NIFLetterException();
			//number = number * -1;
				
	}
	public int getNumber(){
		
		return number;
		
	}
	public char getLetter(){
		
		return letter;
		
	}
	
	public String toString(){
		return number+""+letter;		
	}
	public String toFormattedString() {
	
		StringBuffer strBuff = new StringBuffer(Integer.toString(number));
		if (number > 999)
			strBuff.insert(strBuff.length()-3, ".");
		if(number > 999999)
			strBuff.insert(strBuff.length()-7, ".");
		if(number > 999999999)
			strBuff.insert(strBuff.length()-11, ".");
		return strBuff.toString()+"-"+letter;
	
	}
	
	public void setNumber(int newNumber) throws NIFException{
		number = newNumber;
		if (number <0 )
			throw new NIFException();
		letter=letters[number%23];
	}
	public boolean isCorrect(){
		if(number >= 0 && number < 99999999 )
			return true;
		else
			return false;	
	}
	public DNI(String newDni) throws NIFException {
		String newString = newDni.replaceAll("[0-9]", "");
		try{
			number = Integer.parseInt(newString);
		}catch(NumberFormatException n){
			throw new NIFException();
		}
		char newLetter = newString.charAt(newString.length() -1);
		newLetter = Character.toUpperCase(newLetter);
		letter = letters[number%23];
		if (letter!=newLetter)
			number = -number;
	}
	public static char getLetterforDni(int newNumber){
		
		return letters[newNumber%23];
		
	}
	public static String getNifforDni(int newNumber){
		return newNumber+""+letters[newNumber%23];
	}

}
