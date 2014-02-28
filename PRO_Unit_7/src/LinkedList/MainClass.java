package LinkedList;
// Original Linked List
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		System.out.println("****LinkedList****");
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
