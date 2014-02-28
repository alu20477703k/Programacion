package SortedArray;

public class MainClass {

	public static void main(String[] args) {

		SortedArray a = new SortedArray(10);
		
		a.put(1);
		a.put(3);
		a.put(2);
		a.put(8);
		a.put(0);
		a.removeElementAt(0);
		
		
		System.out.println("\nArray: "+a.toString()+"\n");		
		System.out.println("Size of the array: "+a.getSize());
		System.out.println("Number of Elements: "+a.getNumElements());
		System.out.println("Element at 0: "+a.getElementAt(0));
		System.out.println("Is the Array Empty?: "+a.isEmpty());
		System.out.println("Is the Array Full?: "+a.isFull());
		
	}

}
