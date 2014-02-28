package Stack_Queue;


public class MainClass {

	public static void main(String[] args) throws ObjectNotFoundException,
													 EmptyListException {
		
		Stack s = new Stack();
		s.push("One");
		s.push("Two"); 
		s.push("Three"); 
		s.print( ); 
		System.out.println(s.pop( )); 
		System.out.println(s.pop( )); 
		s.print( );
		System.out.println("---------------");
		s.empty();
		s.push("One"); 
		s.push("Two");
		s.print( ); 
		s.pop( );
		s.pop( ); 
		//s.pop( );
		System.out.println("---------------");
		s.empty();
		s.push("One");
		s.push("Two");
		s.push("Three"); 
		s.pop(); 
		s.push("Four"); 
		s.print();
		System.out.println("================");
		Queue2 q = new Queue2();
		q.push("One");
		q.push("Two"); 
		q.push("Three"); 
		q.print( ); 
		System.out.println(q.pop( )); 
		System.out.println(q.pop( )); 
		q.print( );
		System.out.println("---------------");
		q.empty();
		q.push("One"); 
		q.push("Two");
		q.print( ); 
		q.pop( );
		q.pop( ); 
		//s.pop( );
		System.out.println("---------------");
		q.empty();
		q.push("One");
		q.push("Two");
		q.push("Three"); 
		q.pop(); 
		q.push("Four"); 
		q.print();

	}
}
