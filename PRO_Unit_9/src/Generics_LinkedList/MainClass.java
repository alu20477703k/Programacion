// LinkedList With Generics
package Generics_LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> list = new LinkedList<Object>();
		System.out.println("****LinkedList With Generics****");

		list.insertFirst("Uno");
		list.insertFirst("dos");
		list.insertFirst("tres");

		list.print();
		while (!list.isEmpty()) {
			try {
				Object obj = list.getLastObject();
				System.out.println(obj);
				list.remove(obj);
			} catch (EmptyListException ex) {
				System.out.println("Empty list");
			} catch (ObjectNotFoundException e) {
				System.out.println("error");
			}
		}
	}

}
