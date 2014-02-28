package Generics_SortedArray;


public class Main {

	public static void main(String[] args) {
		SortedArray<Integer> arr = new SortedArray<Integer>(20);
		arr.put(2);
		arr.put(4);
		arr.put(8);
		arr.put(12);
		arr.put(20);
		arr.put(30);
		System.out.println(arr);
		if (arr.existsElement(6)) {
			System.out.println("existe");
		} else {
			System.out.println("no existe");
		}
	}

}
