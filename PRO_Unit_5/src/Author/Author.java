package Author;
import java.util.Scanner;

public class Author {

	private String name;
	private String email;
	private char gender;

	public Author(String newName, String newEmail, char newGender){
		
		name=newName;
		email=newEmail;
		gender=newGender;	
		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return name+ " ("+gender+")"+ " at " + email;
				
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	public Author inputAuthor(){
		
		Scanner input = new Scanner(System.in);
		Author a = null;
		System.out.print("Name: ");
		
		do{
			
			name = input.next();
			if (name.isEmpty())
				System.out.println("Not valid name");
			
		}while(name.isEmpty());
		
		do{
			
			System.out.print("Gender: ");
			gender = input.next().charAt(0);
			
		}while(gender!='f' && gender!='m' && gender!='M' && gender!='F');

		
		System.out.print("Email: ");
			
		email = input.next();
				
		return a;
		
	}
}
