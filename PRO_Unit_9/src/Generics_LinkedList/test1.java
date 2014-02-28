package Generics_LinkedList;

public class test1 {

	public static void main(String[] args) throws EmptyListException {
		
		Stack s = new Stack();
		
		s.push("One"); 
		s.push("Two"); 
		s.push("Three"); 
		s.print( ); 
		System.out.println(s.pop( ));

	}

}
