package Generics_SortedArray;

public class SortedArray<T extends Comparable<T>> {
	
	private T[] array;
	private int numElements;
	
	public SortedArray(int size) {
		numElements=0;
		//@SuppressWarnings({"unchecked"})
		array = (T[]) new Comparable[size];
	}
	public T getElementAt(int pos) {
		return array[pos];
	}
	public int getNumElements() {
		return numElements;
	}
	public int getSize() {
		return array.length;
	}
	public boolean isEmpty() {
		if (numElements==0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isFull() {
		if (numElements == getSize())
			return true;
		else
			return false;
	}
	public String toString() {
		if (isEmpty())
			return "";
		StringBuilder s = new StringBuilder();
		s.append(array[0]);
		for (int i=1; i<numElements; i++) {
			s.append(", "+array[i]);
		}
		return s.toString();
	}
	public void removeElementAt(int pos) {
		if ((pos<0) || (pos>numElements-1))
			return;
		for(int i=pos; i<numElements-1; i++) {
			array[i]=array[i+1];
		}
		numElements--;
	}
	public void put(T element) {
		int cont=numElements-1;
        if (cont == array.length-1)
            cont--;
		while ((cont>=0) && (element.compareTo(array[cont])<0) ) {
			array[cont+1]=array[cont];
			cont--;
		}
		array[cont+1]=element;
		numElements++;
	}
	public boolean existsElement(T element) {
		int start = 0;
		int end = numElements-1;
		int middle = (start + end)/2;
		while ((end>=start)) {
			middle = (start + end)/2;
			if (array[middle].equals(element))
				return true;
			else
				if (array[middle].compareTo(element)>0) {
					end = middle - 1;		
				} else {
					start = middle + 1;
				}
		}
		return false;
	}
		
}
