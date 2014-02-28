package DNI_Exceptions;

public class MainDNI {

	public static void main(String[] args) {

		DNI dni;
		
		try {
			dni = new DNI(-20477703,'K');
		} catch (NIFException e) {
			System.out.println("Incorrect NIF");
		} catch (NIFLetterException e2){
			System.out.println("Incorrect Letter");
		} catch (NumberFormatException e3){
			System.out.println("Incorrect NIF");
		}

		
	}
}



